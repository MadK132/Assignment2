import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> List = new ArrayList<>();
        List.add(new Student("Nurislam", "Toktarov",2.3));
        List.add(new Student("Saulebay", "Nurdaulet", 3.2));
        List.add(new Employee("Danial", "Smagulov", "Bomj", 0));
        List.add(new Employee("Madiyar","Kashkenov","WEB-Developer", 150000));
        Collections.sort(List);
        for (Payable payable : List){
            System.out.println(payable);
        }
        }
    public void printData(Iterable<Person>Iterator){

    }
}