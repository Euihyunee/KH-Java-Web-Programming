package day1231.operator;

public class LogicalTest {
    public static void main(String[] args) {
        // 논리 연산자

        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println("a && b : " + (a && b));
        System.out.println("b && c : " + (b && c));
        System.out.println("a || b : " + (a || b));
        System.out.println("!(a && b) : " + (!(a && b)));
        System.out.println("!(a || b) : " + (!(a || b)));
        // 부정 연산자가 우선임
        System.out.println("!a && b : " + (!a && b));
        System.out.println("!c && a : " + (!c && a));

        int i=60, j=13, k=10;
        System.out.println("i>j && j>k : " + (i>j && j>k));
        System.out.println("i>k && j<k : " + (i>k && j<k));
        System.out.println("i<k && j>k : " + (i<k && j>k));
        System.out.println("i<k && j<k : " + (i<k && j<k));
        System.out.println("===================");

        System.out.println("i>j || j>k : " + (i>j || j>k));
        System.out.println("i>k || j<k : " + (i>k || j<k));
        System.out.println("i<k || j>k : " + (i<k || j>k));
        System.out.println("i<k || j<k : " + (i<k || j<k));

        // 연산자에 우선순위가 있다.
        System.out.println("i>j || j<k && k=10 : " + (i>j || j<k && k==10));
    }
}
