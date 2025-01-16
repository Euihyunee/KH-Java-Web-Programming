package inheritance.animal;

public class AniamlTest02 {
    public static void main(String[] args) {
        Reptile r = new Reptile();
        Animal ar = r;

        System.out.println(ar instanceof Animal);
        System.out.println(ar instanceof Reptile);
        System.out.println(ar instanceof Object);
    }
}
