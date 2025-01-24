package test.kh.javafx;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

    ExecutorService executorService;
    ServerSocket serverSocket;
    //여러명의 클라이언트 집합구성
    List<Client> connections=new Vector<Client>();

    void startServer() {
        int coreCount=Runtime.getRuntime().availableProcessors();
        //현재서버컴퓨의 코어개수만큼 스레드풀을적용
        executorService=Executors.newFixedThreadPool(coreCount);
        //서버소켓 바인딩
        try {
            serverSocket=new ServerSocket(12345);
        } catch (IOException e) {
            if(!serverSocket.isClosed()) stopServer();
            return;//리턴을만나면 메서드가 종료된다.
        }


        Runnable runnable=()->{
            Platform.runLater(()->{
                displayText("[서버시작]");
                //btnStartStop.setText("STOP");
            });
            //서버준비....
            while(true) {
                try {
                    Socket socket=serverSocket.accept();
                    String message="[연결완료:"+socket.getRemoteSocketAddress()+"]";
                    Platform.runLater(()->displayText(message));

                    //접속한 클라이언트 정보세팅
                    Client client=new Client(socket);
                    connections.add(client);
                    Platform.runLater(()->displayText("[접속자수 : "+connections.size()+"명]"));
                } catch (IOException e) {
                    if(!serverSocket.isClosed()) stopServer();
                    break;
                }
            }//while()

        };//runnable

        //스레드 풀에 실행할 작업를 추가(큐)
        executorService.submit(runnable);

    }//startServer()
    private void displayText(String string) {


    }
    void stopServer() {
        //connections.forEach((client)->{});
        try {
            for(Client client:connections) {
                client.socket.close();
                connections.remove(client);
            }

            if(serverSocket!=null && !serverSocket.isClosed())serverSocket.close();

        } catch (Exception e) {
        }
        if(executorService!=null && !executorService.isShutdown())executorService.shutdown();
        //정상적으로 종료된후

        Platform.runLater(()->{
            displayText("[서버STOP]");
            //btnStartStop.setText("START");
        });

    }

    class Client{
        Socket socket;
        public Client(Socket socket) {
            this.socket=socket;
            receive();
        }
        private void receive() {
            Runnable runnable=()->{
                try {
                    while(true) {
                        byte[] readData=new byte[1024];
                        InputStream is=socket.getInputStream();
                        int readCount=is.read(readData);
                        if(readCount==-1)throw new IOException(); //예외발생
                        String data=new String(readData, 0, readCount, "UTF-8");
                    }

                } catch (IOException e) {
                }

            };//runnable
        }//receive()
    }//Client class


    Button btnStartStop;
    TextArea txtDisplay;

    @Override
    public void start(Stage primaryStage) {
        try {
            //UI생성코드
            LocalDate today=LocalDate.now();
            txtDisplay=new TextArea("---"+today.toString()+"---");
            txtDisplay.setEditable(false);
            BorderPane root = new BorderPane();
            BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
            root.setCenter(txtDisplay);

            btnStartStop=new Button("START");
            btnStartStop.setPrefHeight(30);
            btnStartStop.setMaxWidth(Double.MAX_VALUE);
            //클릭이벤트 등록


            root.setBottom(btnStartStop);

            Scene scene = new Scene(root,500,300);




            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("조재청's Chat");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}