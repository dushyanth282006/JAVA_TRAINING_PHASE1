package Day1;

public class Unboxing {

    public static void main(String[] args) {

        Integer obj = Integer.valueOf(20); // Boxing

        int num = obj.intValue(); // Unboxing

        System.out.println("Integer object: " + obj);
        System.out.println("Primitive int: " + num);
    }
}