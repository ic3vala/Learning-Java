import Day4.Pet;
public class Application {
    public static void main(String[] args) {

        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;
        dog.bark();

        System.out.println(dog.name);
        System.out.println(dog.age);

    }
}
