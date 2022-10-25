import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++)
        {
            // Pesho 12
            // input[0] = Pesho
            // input[1] = 12

            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            people.add(person);
        }

        //Collections.sort(people);

        for (int i = 0; i < people.size(); i++)
        {
            System.out.println(people.get(i));
        }

        for (Person per : people)
        {
            System.out.println(per);
        }


//       Animal dog = new Animal("Dog", 20);
//       Animal cat = new Animal("Cat", 10);
//       Animal test = new Animal();
//        System.out.println(dog.getAge());
//        System.out.println(cat.getAge());
//
//        dog.setAge(21);
//        cat.setAge(11);
//
//        System.out.println(dog.getAge());
//        dog.testing();
//
//        System.out.println(Animal.animalCounter);
//
//        Animal rabbit = new Animal("Rabbit", 10);
//        System.out.println(Animal.animalCounter);
    }

//    public void test()
//    {
//        System.out.println("Testing...");
//    }
}