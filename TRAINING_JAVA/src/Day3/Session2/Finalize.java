package Day3.Session2;

class Universe {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Universe object is destroyed");
    }
}

public class Finalize {

    public static void main(String[] args) {

        new Universe();

        // Request JVM to run garbage collector
        System.gc();

        System.out.println("End of main method");
    }
}