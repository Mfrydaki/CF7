package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert a numerator.");
        while (!in.hasNext()) {
            System.out.println("Error! Input must be int. Please insert numerator.");
        }
        numerator = in.nextInt();

        System.out.println("Please insert a denominator.");
        while (!in.hasNext()) {
            System.out.println("Error! Input must be int.Please insert a denominator.");
        }
        denominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Error! Denominator must not be zero.");
            System.exit(1);

        }
        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n" ,numerator ,denominator , result);
        System.exit(1);
    }

}
