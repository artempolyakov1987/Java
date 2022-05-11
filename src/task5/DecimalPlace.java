package task5;


public class DecimalPlace {
    public static void main(String[] args) {
        double number1= doubleToDecimalPlaces(1444.4454444, 2);
        System.out.println("result of decimal:" +number1);

    }
    private static double doubleToDecimalPlaces(double number, int countAfterPoint){
        int number1 = (int)(Math.pow(10, countAfterPoint));
        return (double) (Math.round(number*number1))/number1;



    }
}
