package test;

public class People {
    private String name;
    public int age;
    static int count;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    public void print(){
        System.out.println(name + " " + age + " " + count);
    }
    static void printCount(){
        System.out.println(count);
    }
}
