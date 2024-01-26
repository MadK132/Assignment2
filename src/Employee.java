import java.util.ArrayList;

public class Employee extends Person implements Payable{
    private String position;
    private double salary;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Employee(){
        super();
    }
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
    public void enroll2(Employee employee){
        employees.add(employee);
    }
    @Override
    public String toString() {
        return super.toString() + " " + "earns " + getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
