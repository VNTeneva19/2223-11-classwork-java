import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  scanner.nextLine();

        String[] tokens = input.split("\\s+");

        for (int i = 0; i < tokens.length / 2; i++) {
            String temp = tokens[i];

            tokens[i] = tokens[tokens.length - 1 - i];

            tokens[tokens.length - 1 - i] = temp;

//            tokens[0] = tokens[tokens.length - 1];
        }

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Dragan");
        names.add("Gosho");

        Collections.reverse(names);

        System.out.println(String.join(", ", names));
    }
}
