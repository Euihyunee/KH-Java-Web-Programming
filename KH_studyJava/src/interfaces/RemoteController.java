package interfaces;

// 클래스 선언과 아주 흡사
// 파일 생성 규칙도 동일
public interface RemoteController {
    // 인터페이스는 추상메서드 집합이므로 abstract 키워드는 생략해도 됩니다.
    void disp();
    abstract void disp2();
    abstract void disp3();
    abstract void disp4();
    // java 8이상에서 허용
    default void print(){};
    static void print2(){};
    // 필드는 사용 가능한가요?
    // 인스턴스 변수는 불가능 (클래스 멤버 변수)
    // static 키워드가 없어도 static 필드입니다.
    // final 키워드가 없어도 final 필드입니다.
    // -> 결국 상수만 허용
    int num = 0;
    static int num2 =0;
    final int num3 = 0;
}
