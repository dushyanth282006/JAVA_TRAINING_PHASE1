package Day3.Session1;

public class CompileTimePolymorphism {

    // Method with one parameter
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with three parameters
    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    // Method with different parameter types
    void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {

        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
    }
}