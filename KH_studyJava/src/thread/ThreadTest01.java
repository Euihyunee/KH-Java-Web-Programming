package thread;

public class ThreadTest01 {
    public static void main(String[] args) {

        MyThread thread = new MyThread();

        // 스레드를 적용시키려면 run() 직접호출하면 안 됨
//        thread.run();

        thread.start();// 스레드가 동작합니다.

        for (int i = 0; i < 100; i++) {
            System.out.println("main: " +i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}