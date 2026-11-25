class Main {
    static void main(String[] args) {
        Person p = new Person();
        p.setName("Beetge", "Jonathan");
        p.setAge(16);
        System.out.println(p.fullName());
        System.out.println(p.getAge());

        Employee e = new Employee("Auer", "Alexander", "E001", 22);
        e.setSalary(2000);
        e.salaryIncrease(10);
        e.setSupervisorId("E002");
        e.printAll();
        System.out.println();

        Employee e2 = new Employee("Kleshchenko", "Lev", "E002", 32);
        e2.setSalary(5400);
        e2.salaryIncrease(2.5);
        e2.printAll();
        System.out.println();
    }
}