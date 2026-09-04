package Day3.Session1;

class Animal {

    void makeSound() {
        System.out.println("Animal Makes Sound Here");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Elephant extends Animal {

    @Override
    void makeSound() {
        System.out.println("Trumpets");
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Elephant();
        a.makeSound();
    }
}