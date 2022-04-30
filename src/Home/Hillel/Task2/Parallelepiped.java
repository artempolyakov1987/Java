package Home.Hillel.Task2;

public class Parallelepiped {
    public static void main(String[] args) {
        double a = 13.6;
        double b = 16.5;
        double c = 21;
        double volume = a * b * c;
        double length = 4*(a+b+c);
        float w = 48.42596F;
        float d = 35.02942F;

        System.out.printf("Volume of the parallelepiped = %.2f", volume);
        System.out.println();
        System.out.printf("Length = %.2f", length);
        System.out.println();
        System.out.println("Width = " + w);
        System.out.println("Duration = " + d);
    }

}
