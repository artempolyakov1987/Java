package homework2;

public class Cycle {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma parnyh chisel: " + sum);
        }
}
