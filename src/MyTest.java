
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    void fullNameReturnsFirstNameThenLastName() {
        Person p = new Person("Huber", "Anna");
        assertEquals("Anna Huber", p.fullName());
    }

    @Test
    void salaryIncreaseByTenPercentRaisesSalaryFrom2000To2200() {
        Employee e = new Employee("Huber", "Anna", "1", 30);
        e.setSalary(2000);
        e.salaryIncrease(10);
        assertEquals(2200.0, e.getSalary());
    }

    @Test
    void negativeAgeThrowsIllegalArgumentException() {
        Person p = new Person("Huber", "Anna");
        assertThrows(IllegalArgumentException.class, () -> p.setAge(-1));
    }

    @Test
    void negativeAgeInEmployeeConstructorThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> new Employee("Huber", "Anna", "1", -1));
    }

    @Test
    void negativeSalaryThrowsIllegalArgumentException() {
        Employee e = new Employee("Huber", "Anna", "1", 30);
        assertThrows(IllegalArgumentException.class, () -> e.setSalary(-0.01));
    }

    @Test
    void employeeCanBeUsedWhereAPersonIsExpected() {
        Person p = new Employee("Huber", "Anna", "1", 30);
        assertEquals("Anna Huber", p.fullName());
        assertEquals(30, p.getAge());
        assertInstanceOf(Employee.class, p);
    }
}
