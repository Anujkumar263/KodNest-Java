
class Professor extends Person {

    String subject;
    double salary;

    Professor(int id, String name, int age, String subject, double salary) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Professor");
    }

}
