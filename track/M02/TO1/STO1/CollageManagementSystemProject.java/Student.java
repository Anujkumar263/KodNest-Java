
class Student extends Person {

    String course;
    double fee;

    Student(int id, String name, int age, String course, double fee) {
        super(id, name, age);
        this.course = course;
        this.fee = fee;
    }

    @Override
    double calculatePayment() {
        return fee;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }

}
