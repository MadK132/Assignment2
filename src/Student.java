import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student extends Person implements Payable{
    private double gpa;
    private ArrayList<Student> students = new ArrayList<>();
    public Student(){
        super();
    }
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

    @Override
    public String toString() {
        return super.toString() + " GPA: " + getGpa();
    }
    public void enroll(Student student){
        students.add(student);
    }

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

