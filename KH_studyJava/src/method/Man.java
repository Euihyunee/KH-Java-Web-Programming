package method;

public class Man {

    int age;
    String name;
    boolean marital;
    int childrenNum;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Man() {
    }

    public Man(int age, String name, boolean marital, int childrenNum) {
        this.age = age;
        this.name = name;
        this.marital = marital;
        this.childrenNum = childrenNum;
    }

    public boolean isMarital() {
        return marital;
    }

    public void setMarital(boolean marital) {
        this.marital = marital;
    }

    public int getChildrenNum() {
        return childrenNum;
    }
    void print(){
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("결혼여부 : " + marital);
        System.out.println("자녀수 : " + childrenNum);
    }

    public void setChildrenNum(int childrenNum) {
        this.childrenNum = childrenNum;
    }
}
