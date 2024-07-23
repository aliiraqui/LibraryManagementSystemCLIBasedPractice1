package domain;

public class Employee extends Person {
    private String role;

    public Employee(String name, String role) {
        super(name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void display() {
        System.out.println("~~~ Employee ~~~\n" +
                "Name: " + getName() + "\n" +
                "Employee's Role: " + role);
    }
}
