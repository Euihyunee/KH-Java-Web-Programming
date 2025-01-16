package anonymous;

public abstract class AbstractClass {
    abstract void method1();
}

@FunctionalInterface // 추상 메서드가 1개만 존재하는 인터페이스
interface Inter{
    void method2();
}

class InterSub implements Inter{

    @Override
    public void method2() {
        System.out.println("오버라이드 InterSub1의 method2");
    }
}
class InterSub2 implements Inter{

    @Override
    public void method2() {
        System.out.println("오버라이드 InterSub2의 method2");
    }
}
