package homeHillel.task3;

public class Task1 {
    public static void main(String[] args) {
        double shar1 = 4.0 / 3.0 * Math.PI * Math.pow(1, 3);
        double shar2 = 4.0 / 3.0 * Math.PI * Math.pow(0.5, 3);
        double shar3 = 4.0 / 3.0 * Math.PI * Math.pow(0.2, 3);
        double weight = (shar1 * 0.7) + (shar2 * 0.7) + (shar3 * 0.7);

        System.out.printf("Weight of the Snowman, kg = %.2f", weight);
    }
}