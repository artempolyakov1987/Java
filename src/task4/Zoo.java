package task4;

public class Zoo {
    public static void main(String[] args) {
        int beer = 2;
        int tiger = 5;
        int parrot = 20;
        int elephant = 3;
        int raccoon = 12;
        int porcupine = 29;
        int count = (int) countAnimals(beer, tiger, parrot, elephant, raccoon);
        double count1 = countAnimalsNextYear(beer, tiger, parrot, elephant, raccoon);
        long count2 = Math.round(count1);
        double count3 = countAnimalsNextYear6(beer, tiger, parrot, elephant, raccoon, porcupine);
        long  count4 = Math.round(count3);

        System.out.println("The count of animals in the zoo this year: " + count);
        System.out.println("The count of animals in the zoo next year: " + count2);
        System.out.println("The count of animals in the zoo next year with porcupine: " + count4);

    }

    public static long countAnimals(int beer, int tiger, int parrot, int elephant, int raccoon) {
        return beer + tiger + parrot + elephant + raccoon;
    }

    public static double countAnimalsNextYear(int beer, int tiger, int parrot, int elephant, int raccoon) {
        return (double) ((beer * 0.3 + beer) + (tiger * 0.2 + tiger) + (parrot * 0.4 + parrot) + (elephant * 0.05 + elephant) + (raccoon * 0.8 + raccoon));

    }

    public static double countAnimalsNextYear6(int beer, int tiger, int parrot, int elephant, int raccoon, int porcupine) {
        return (double) (countAnimalsNextYear(beer, tiger, parrot, elephant, raccoon) + (porcupine * 0.15 + porcupine));

    }
}
