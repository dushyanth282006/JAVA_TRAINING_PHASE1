package Day12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of web pages: ");
        int N = sc.nextInt();

        int hyperlinks = 0;

        System.out.println("Enter the " + N + " x " + N + " adjacency matrix:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                int value = sc.nextInt();

                if (value == 1) {
                    hyperlinks++;
                }
            }
        }
        
        System.out.println("Number of web pages: " + N);
        System.out.println("Number of hyperlinks: " + hyperlinks);

        sc.close();
    }
}
