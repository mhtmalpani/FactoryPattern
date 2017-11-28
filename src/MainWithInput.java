import animals.Animal;

import java.util.Scanner;

public class MainWithInput {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an Animal: ");
        String animalName = reader.next();
        reader.close();


        //Create instance of Factory
        AnimalFactory animalFactory = new AnimalFactory();


        //Obtain Dog object from the factory
        Animal animal = animalFactory.getAnimal(animalName);

        if (animal != null)
            System.out.println(animalName + " makes noise: " + animal.makeNoise());
        else
            System.out.println("Sorry, we do not know this animal!");

    }
}
