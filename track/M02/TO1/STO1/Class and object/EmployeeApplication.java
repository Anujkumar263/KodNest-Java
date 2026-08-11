
public class EmployeeApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee s1 = new Employee();

        s1.age = 12;
        s1.id = 54;
        s1.name = "Anuj";

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.age);

        System.out.println();

        s1.work();

        Employee s2;
        s2 = s1;
        s2.age = 25;
        s2.id = 58;
        s2.name = "Anu";

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.age);

        System.out.println();

        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.age);

        s2.work();

    }

}
