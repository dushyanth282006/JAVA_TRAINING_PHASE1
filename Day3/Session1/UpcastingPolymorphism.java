package Day3.Session1;

class UpcastingAnimal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class UpcastingDog extends UpcastingAnimal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void eat() {
        System.out.println("Dog eats food");
    }
}

public class UpcastingPolymorphism {
    public static void main(String[] args) {

        // Upcasting: Child object is referred by Parent reference
        UpcastingAnimal a = new UpcastingDog();

        // Runtime polymorphism
        a.sound();

        // a.eat(); // Cannot access Dog-specific method using Animal reference
    }
}