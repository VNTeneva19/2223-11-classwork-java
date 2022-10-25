public class Animal {
    private String breed;

    private int age;

    public static int animalCounter = 0;

    public Animal()
    {
        this.age = 10;
    }

    public Animal(String breed, int age)
    {
        this.breed = breed;
        this.age = age;
        animalCounter++;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static void testing()
    {

    }
    @Override
    public String toString()
    {
        return "The breed is: " + this.getBreed() + " and its age is: " + this.getAge();
    }
}
