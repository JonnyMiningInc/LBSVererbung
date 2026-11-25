class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person {}

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}