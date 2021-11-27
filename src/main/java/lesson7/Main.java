package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Ginger", 2, "orange");
        Dog dog = new Dog("Bagel", 3,"black and white");
        Tiger tiger = new Tiger("Sherkhan", 6, "orange with black stripes");

        System.out.println(cat);
        cat.run(100);
        cat.swim(5);
        System.out.println();

        System.out.println(dog);
        dog.run(500);
        dog.swim(500);
        System.out.println();

        System.out.println(tiger);
        tiger.run(120);
        tiger.swim(59);
    }
}
