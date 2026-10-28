class AdminStaff extends Person{
	
	 String department;
	    double salary;

	    AdminStaff(int id, String name, int age,
	               String department, double salary) {
	        super(id, name, age);
	        this.department = department;
	        this.salary = salary;
	    }

	    @Override
	    double calculatePayment() {
	        return salary;
	    }

	    @Override
	    void displayRole() {
	        System.out.println("Role: Admin Staff");
	    }

}
