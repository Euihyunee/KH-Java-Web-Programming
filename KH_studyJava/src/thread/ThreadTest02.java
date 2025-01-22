package thread;

public class ThreadTest02 {
    public static void main(String[] args) {

        // 이렇게 선언할 수 있지만 스레드를 시작할 수 없음
        Runnable runable = new MyThread02();
        // 이렇게 해서 runnable을 주입할 수 있음
        Thread thread = new Thread(runable);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
