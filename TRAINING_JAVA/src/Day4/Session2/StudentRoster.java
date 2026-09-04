package Day4.Session2;

import java.util.ArrayList;

public class StudentRoster {
    public static void main(String[] args) {

        ArrayList<String> roster = new ArrayList<>();

        // Add students
        roster.add("Alice");
        roster.add("Bob");
        roster.add("Charlie");
        System.out.println("Roster: " + roster);

        // Insert student
        roster.add(1, "Diana");
        System.out.println("After Insert: " + roster);

        // Remove student
        roster.remove("Bob");
        System.out.println("After Remove: " + roster);

        // Contains check
        System.out.println("Contains Diana: " + roster.contains("Diana"));

        // Index search
        System.out.println("Index of Charlie: " + roster.indexOf("Charlie"));
    }
}