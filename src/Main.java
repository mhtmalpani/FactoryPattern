import animals.Animal;

public class Main {

    public static void main(String[] args) {

        //Create instance of Factory
        AnimalFactory animalFactory = new AnimalFactory();


        //Obtain Dog object from the factory
        Animal dog = animalFactory.getAnimal("Dog");

        System.out.println(dog.makeNoise());


        //Obtain Cat object from the factory
        Animal cat = animalFactory.getAnimal("Cat");

        System.out.println(cat.makeNoise());


        //Obtain Duck object from the factory
        Animal duck = animalFactory.getAnimal("Duck");

        System.out.println(duck.makeNoise());
    }
}
