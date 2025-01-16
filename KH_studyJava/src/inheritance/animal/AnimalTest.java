package inheritance.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Cat cat = new Cat();
        System.out.println(mammal instanceof Animal);
        System.out.println(mammal instanceof Mammal);
        System.out.println(cat instanceof Mammal);

        Animal am = mammal;
        byte b= (byte)128;
        Mammal m = (Mammal) am;
        System.out.println("-완-");
    }
}
