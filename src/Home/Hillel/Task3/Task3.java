package Home.Hillel.Task3;

import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number min:");
        int min = in.nextInt();
        System.out.print("Input a number max:");
        int max = in.nextInt();

        int random = (int) ((Math.random() * ((max - min) + 1)) + min);

        System.out.printf("Your number: %d \n", random);
    }
}
