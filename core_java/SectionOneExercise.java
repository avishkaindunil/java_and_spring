class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

class Manager extends Employee {

    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);     
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Name: " + getName()
                + ", Salary: " + getSalary()
                + ", Department: " + department;
    }
}

public class SectionOneExercise {

    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 50000);

        Employee e2 = new Manager("Bob", 80000, "IT");

        System.out.println(e1.getDetails());
        System.out.println(e2.getDetails());
    }
}