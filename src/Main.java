import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> List = new ArrayList<>();
        List.add(new Student("Nurislam", "Toktarov",2.5));
        List.add(new Student("Saulebay", "Nurdaulet", 3.2));
        List.add(new Employee("Danial", "Smagulov", "Employer", 25000));
        List.add(new Employee("Madiyar","Kashkenov","Employer", 70000));
        Collections.sort(List);
        printData(List);
        }
    public void printData(Iterable<Person> List){
        for(Person person : List){
            System.out.println(person.toString());
        }
    }
}
