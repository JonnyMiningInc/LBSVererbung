public class Employee extends Person {
    private String employeeId;
    private String supervisorId;
    private double salary;

    public Employee(String lastName, String firstName, String employeeId, int age) {
        super(lastName, firstName);
        setAge(age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public void salaryIncrease(double percent) {
        salary = salary + salary * percent / 100;
    }

    public void printAll() {
        System.out.println("Name: " + fullName());
        System.out.println("Age: " + getAge());
        System.out.println("EmployeeId: " + employeeId);
        System.out.println("Supervisor: " + supervisorId);
        System.out.println("Salary: " + salary);
    }
}