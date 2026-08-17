
public class Student {

    String name;
    int age;
    double hight;

    Student(String name, int age, double hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(hight);
    }

}
