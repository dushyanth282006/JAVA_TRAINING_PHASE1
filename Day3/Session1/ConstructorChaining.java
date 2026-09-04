package Day3.Session1;

class Parent {

    Parent() {
        System.out.println("Parent class constructor");
    }

    Parent(int x) {
        this();
        System.out.println("Parent parameterized constructor: " + x);
    }
}

public class ConstructorChaining extends Parent {

    ConstructorChaining() {
        this(10);
        System.out.println("Child default constructor");
    }

    ConstructorChaining(int x) {
        super(x);
        System.out.println("Child parameterized constructor: " + x);
    }

    public static void main(String[] args) {

        new ConstructorChaining();
    }
}