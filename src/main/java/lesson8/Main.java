package lesson8;

public class Main {
    public static void main(String[] args) {
        Animal[] homeAnimals = {new Dog(), new Cat(), new Pig()};
        for (Animal homeAnimal : homeAnimals) {
            homeAnimal.voice();
        }
    }
}
