import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student extends Person implements Payable{
    private double gpa;
    private ArrayList<Student> students = new ArrayList<>();
    //No argument constructor
    public Student(){
        super();
    }
    //parameterized constructor to set values
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public void setGpa(double gpa){
    this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    //toString() - need to override from a person and add information such as in assignment requirements
    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
    public void enroll(Student student){
        students.add(student);
    }
    //getPaymentAmount() - we use gpa as a basis to get a payment of a student
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660;
        }
        else {
            return 0;
        }
    }
}
//getter and setters as a necessary to fill in information and return them
