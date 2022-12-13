public class Person extends Mammal implements Animal {

    private String name;


    public Person(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat()
    {
        System.out.println("Person is eating..");
    }

    @Override
    public void walk() {
        System.out.println("Person is walking..");
    }

    @Override
    public void test(String text) {
        System.out.println("Testing in person");
    }
}
