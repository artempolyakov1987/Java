package task5;


public class DecimalPlace {
    public static void main(String[] args) {
        double number1= doubleToDecimalPlaces(14.45666, 3);
        System.out.println("result of decimal:" +number1);

    }
    private static double doubleToDecimalPlaces(double number, int countAfterPoint){
        double  number1 = (Math.pow(10, countAfterPoint));
        double number2=number*number1;
        double v = Math.round(number2) / number1;
        return v;


    }
}
