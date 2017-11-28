import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;

public class AnimalFactory {

    public Animal getAnimal(String animal) {

        if (animal == null)
            return null;

        else if (animal.equalsIgnoreCase(Dog.class.getSimpleName()))
            return new Dog();

        else if (animal.equalsIgnoreCase(Cat.class.getSimpleName()))
            return new Cat();

        else if (animal.equalsIgnoreCase(Duck.class.getSimpleName()))
            return new Duck();

        return null;
    }
}
