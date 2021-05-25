package by.epam.unit03.main;

public class Task05 {
    public static void main(String[] args){
        double a = 1;
        double b = 5;
        double h = 1;
        double f;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("|\t%4s\t|\t%4s\t|\n","x", "f");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (double x = a; x <= b; x = x + h){
            f = 2 * Math.tan(x / 2) + 1;
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, f);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
