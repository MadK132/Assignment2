import java.util.concurrent.CopyOnWriteArrayList;

public class Person implements Payable, Comparable<Person>{
    private static  int id_gen = 1;
    private String name;
    private int id;
    private String surname;
    public Person(){
        id = id_gen++;
    }
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
    public String getPosition(){
        return "Student: ";
    }
    @Override
    public String toString() {
        return getPosition() + id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
