package task5;

import java.util.Scanner;

public class TypeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Type int: " + number);
            positiveOrnegative(number);
        } else if (sc.hasNextDouble()){
            double number = sc.nextDouble();
            System.out.printf("Type double  = %.2f", number);

        } else if (!sc.hasNextInt()) {
            String number = sc.next();
            System.out.println("Type String: " + number.toUpperCase().trim());

        }else {System.out.println("Sorry, but this is clearly not a number. Restart the program and try again!");
        }
    }
        private static void positiveOrnegative (int a) {
            if (a == 0) {
                System.out.println("Zero value");
            } else if (a > 0) {
                System.out.println("Positive value: " + a);
            } else {
                System.out.println("Negative value: " + a);
            }

    }
}
