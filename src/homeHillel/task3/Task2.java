package homeHillel.task3;

public class Task2 {
    public static void main(String[] args) {
        int wariorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int powerLi = 860;
        int wariorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        double powerMi = (powerLi * 1.5);
        int powerMi1 = (int) Math.round(powerMi);
        int totalArmyLi = powerLi * (wariorLi + archerLi + riderLi);
        int totalArmyMin = powerMi1 * (wariorMin + archerMin + riderMin);

        System.out.println("Total power of army Li = " + totalArmyLi);
        System.out.println("Total power of army Min = " + totalArmyMin);

    }
}
