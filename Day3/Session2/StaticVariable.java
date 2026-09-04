package Day3.Session2;

class Bank {

    static String appName = "Bank App";

    static void printCount() {
        System.out.println("Static Method");
    }
}

public class StaticVariable {

    public static void main(String[] args) {

        System.out.println(Bank.appName);

        Bank.printCount();
    }
}