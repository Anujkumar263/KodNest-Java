
public class ObjectCreation {

    String name;
    int age;
    double hight;

    ObjectCreation() {
        name = null;
        age = 0;
        hight = 0.0;
    }

    ObjectCreation(String name, int age, double hight) {
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
