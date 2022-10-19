import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your lamp's wattage");

        for (int i = 0; i < 5; i++)
        {
            int input = scan.nextInt();

            Lamp lamp = new Lamp(input);

            lamp.switchLampOnOrOff();
        }
//        Car car = new Car();
//        Scanner scan = new Scanner(System.in);
//
//        String brand = scan.nextLine();
//        String model = scan.nextLine();
//
//        car.start(brand, model);
    }
    ;
}