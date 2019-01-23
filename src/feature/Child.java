package feature;


class Person{
    private String name = "Person";
    int age=0;
    public void function() {
        System.out.println("this is person");
    }
}
public class Child extends Person {

    public String grade;
    int age = 10;

    public void function() {
        System.out.println("this is child");
    }

    public void b1() {
        System.out.println("子类新方法");
    } //B类定义了自己的新方法

    public static void main(String[] args) {
        Person p = new Child();
        p.function();
        System.out.println(p.age);
    }

}
