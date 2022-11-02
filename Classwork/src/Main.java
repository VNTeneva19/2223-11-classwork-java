import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(10);
        dog.setAge(5);
        System.out.println(dog.getAge());

        Animal cat = new Animal(10);

        System.out.println(dog);
        Animal test = cat;

        System.out.println(test.equals(cat));
        System.out.println(dog.hashCode());
        System.out.println(cat.hashCode());
        System.out.println(test.hashCode());

        Integer miniInt = 10;
        int n = Integer.parseInt("1");


    }
}
