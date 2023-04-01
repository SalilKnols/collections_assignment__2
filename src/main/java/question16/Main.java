package question16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.id, otherEmployee.getId());
    }
}


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Salil", 123, 50000.0));
        employees.add(new Employee("Jitin", 234, 40000.0));
        employees.add(new Employee("Ayush", 345, 60000.0));

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - " + employee.getId() + " - " + employee.getSalary());
        }
    }
}

