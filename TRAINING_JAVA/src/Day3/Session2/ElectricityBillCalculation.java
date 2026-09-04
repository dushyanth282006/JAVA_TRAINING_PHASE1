package Day3.Session2;

import java.util.Scanner;

class currentBill {
    public double amount() {
        return 0;
    }
}

class Fan extends currentBill {
    double watts, hours;

    Fan(double watts, double hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours / 1000) * 1.5;
    }
}

class Light extends currentBill {
    double watts, hours;

    Light(double watts, double hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours / 1000) * 1.5;
    }
}

class TV extends currentBill {
    double watts, hours;

    TV(double watts, double hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours / 1000) * 1.5;
    }
}
public class ElectricityBillCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fanWatts = sc.nextDouble();
        double fanHours = sc.nextDouble();

        double lightWatts = sc.nextDouble();
        double lightHours = sc.nextDouble();

        double tvWatts = sc.nextDouble();
        double tvHours = sc.nextDouble();

        // Runtime polymorphism
        currentBill fan = new Fan(fanWatts, fanHours);
        currentBill light = new Light(lightWatts, lightHours);
        currentBill tv = new TV(tvWatts, tvHours);

        double total = fan.amount() + light.amount() + tv.amount();

        System.out.printf("%.2f", total);

        sc.close();
    }
}