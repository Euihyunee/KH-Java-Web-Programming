package anonymous;

public class AnoymousTest01 {
    static void print(Inter inter){}

    public static void main(String[] args) {
//        Inter sub = new InterSub();
//        print(sub);

        print(new InterSub());
        print(new InterSub2());

        print(new Inter(){
            @Override
            public void method2(){
                System.out.println("익명객체");
            }});
        // 람다식 Lamda
        print(() -> {
            System.out.println("테스트");
        });

        // AbstractClass obj = new AbstractClass();
        // AnoymousTest01$1.class
        AbstractClass obj = new AbstractClass() {
            @Override
            void method1() {

            }
        };
        Inter inter = new Inter(){
            @Override
            public void method2() {

            }
        };
    }

}
