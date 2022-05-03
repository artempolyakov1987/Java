package Home.Hillel.Task3;

public class Task2 {
    public static void main(String[] args) {
        int wariorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int powerLi = 860;
        int wariorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
        int totalArmyLi = powerLi * (wariorLi + archerLi + riderLi);
        double totalArmyMin = (powerLi * 1.5) * (wariorMin + archerMin + riderMin);

        System.out.println("Total power of army Li = " + totalArmyLi);
        System.out.printf("Total power of army Min = %.0f", totalArmyMin);

    }
}
