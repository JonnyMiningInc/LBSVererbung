class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Beetge", "Jonathan");
        p.setAge(16);
        System.out.println(p.fullName());
        System.out.println(p.getAge());

        Employee e = new Employee("Auer", "Alexander", "E001", 17);
        e.setSalary(2000);
        e.salaryIncrease(10);
        e.printAll();
        System.out.println();
    }
}