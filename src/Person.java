import java.util.concurrent.CopyOnWriteArrayList;

public class Person implements Payable, Comparable<Person>{
    private static  int id_gen = 1;
    private String name;
    private int id;
    private String surname;
    //Person() - no argument constructor
    public Person(){
        id = id_gen++;
    }
    //parameterized constructor
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getId() {
        return id;
    }
    //getPosition() - use a position "student" as a default return.
    public String getPosition(){
        return "Student: ";
    }
    //toString() - use for output at the end
    @Override
    public String toString() {
        return getPosition() + id + ". " + name + " " + surname;
    }
    //getPaymentAmount() - implement here to override at another subclasses
    @Override
    public double getPaymentAmount() {
        return 0;
    }
    //compareTo() - to compare two doubles in list and after sort with Collection.sort(), necessary to sort with payment
    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
//getter and setters to implement information and return them.
