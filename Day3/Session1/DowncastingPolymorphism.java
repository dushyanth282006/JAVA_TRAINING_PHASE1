package Day3.Session1;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void dogSkill() {
        System.out.println("Dog is playing with the ball");
    }
}

public class DowncastingPolymorphism {

    public static void main(String[] args) {

        // Upcasting
        Animal a = new Dog();

        a.sound();

        // Downcasting
        Dog d = (Dog) a;

        d.sound();
        d.dogSkill();
    }
}