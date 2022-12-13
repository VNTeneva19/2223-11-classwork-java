import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gosho");
        Mammal person2 = new Person("Tosho");
        Animal person3 = new Person("Ivan");

        System.out.println("Person: ");
        System.out.println(person.getName());
        person.eat();
        person.walk();
        person.test("Person");

        System.out.println("Mammal: ");
        person2.walk();
        person2.test("Mammal");

        System.out.println("Animal: ");
        person3.eat();
    }
}