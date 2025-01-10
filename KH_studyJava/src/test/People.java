package test;

public class People {
    private String name;
    public int age;
    static int count;

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        People.count = count;
    }

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
