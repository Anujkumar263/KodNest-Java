
public class Student {

    String name;
    int age;
    double hight;

    void input(String a, int b, double c) {
        name = a;
        age = b;
        hight = c;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("hight: " + hight);
    }
}
