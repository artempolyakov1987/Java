package task6;

import java.util.Random;

public class Shuttle2 {
// The second variant of solutions
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 1; i <= 100; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
                String rand_int = String.valueOf(rand.nextInt(1000))
                        .replaceAll("4","")
                        .replaceAll("9","");
                System.out.println("Shuttle number: " + rand_int);
            } else {
                System.out.println("Shuttle number: " + i);
            }
        }
    }
}

