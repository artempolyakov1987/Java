package Task6;


public class Shuttle {
    public static void main(String[] args) {
        int withoutNumber = 0;
        for (int i = 1; i <= 155; i++) {
            if (i == 4 + withoutNumber) {
                withoutNumber += 5;
                continue;
            } else if (i >= 40 && i < 50 || i >= 90 && i < 100 || i >= 140 && i < 150) {
                continue;
            } else {
                System.out.println("Space shuttle # " + i);

            }


        }
    }
}