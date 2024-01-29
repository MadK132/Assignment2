import java.util.ArrayList;

public class Employee extends Person implements Payable{
    private String position;
    private double salary;
    private ArrayList<Employee> employees = new ArrayList<>();
    //no argument constructor
    public Employee(){
        super();
    }
    //parameterized constructor
    public Employee(String name, String surname, String position, double salary){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position + ": ";
    }

    public double getSalary() {
        return salary;
    }
    //enroll2() - not necessary, just forgot to remove this method (want to create append as in lecture video)
    public void enroll2(Employee employee){
        employees.add(employee);
    }
    //toString - using override to differentiable position in Employee subclass and return salary.
    @Override
    public String toString() {
        return super.toString() + " " + "earns " + getPaymentAmount() + " tenge";
    }
    //getPaymentAmount() - using override to return salary of employer.
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
//getter and setters - to implement information and return them.
