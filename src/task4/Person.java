package task4;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "2936729462568"));
    }

    public static String personInfo(String firstName, String lastName, String city, String number) {
        return "Call a citizen  " + firstName + "  " + lastName + "  from the city  " + city + "   possibly by number  " + number;

    }
}