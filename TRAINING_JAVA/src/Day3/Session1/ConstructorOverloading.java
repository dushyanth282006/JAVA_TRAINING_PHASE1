package Day3.Session1;

public class ConstructorOverloading {

    int id;
    String name;
    double salary;

    // Default constructor
    ConstructorOverloading() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    // Constructor with two parameters
    ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
        salary = 0.0;
    }

    // Constructor with three parameters
    ConstructorOverloading(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        ConstructorOverloading obj1 =
                new ConstructorOverloading();

        ConstructorOverloading obj2 =
                new ConstructorOverloading(101, "Deepak");

        ConstructorOverloading obj3 =
                new ConstructorOverloading(102, "Rahul", 25000.0);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
