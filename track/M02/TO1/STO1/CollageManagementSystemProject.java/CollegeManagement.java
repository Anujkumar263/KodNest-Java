
class CollegeManagement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Person[] people = {
            new Student(101, "Rahul", 20, "Java", 25000),
            new Student(102, "Priya", 21, "Python", 30000),
            new Professor(201, "Mahesh", 40, "Java", 60000),
            new Professor(202, "Kavya", 35, "SQL", 55000),
            new AdminStaff(301, "Ramesh", 32, "Accounts", 35000)
        };

        double totalPayment = 0;

        for (Person person : people) {
            System.out.println("--------------------");

            person.showDetails();
            person.displayRole();

            double payment = person.calculatePayment();

            System.out.println("Payment: " + payment);

            totalPayment = totalPayment + payment;
        }

        System.out.println("--------------------");
        System.out.println("Total Payment: " + totalPayment);

    }

}
