package thread;

public class ThreadTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while(true){
                System.out.println("자동 저장");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        // 데몬스레드: 메인스레드가 종료되면 데몬스레드도 같이 종료됩니다.
        thread.setDaemon(true); // 데몬 설정
        thread.start(); // 스레드 실행
        // 메인 스레드가 종료되었음에도 계속 실행하는 독립스레드이다

        for (int i = 0; i < 100; i++) {
            System.out.println("문서 작업 중");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("프로그램 종료");
    }
}
