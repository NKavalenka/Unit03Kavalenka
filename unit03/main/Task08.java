package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        String sign;
        double z = 0;

        while (true) {
            System.out.println("Enter value for X: ");
            if (sc.hasNext("#")) {
                System.out.print("Stop");
                sc.close();
                break;
            }
            while (!sc.hasNextDouble()) {
                System.out.print("Enter value for X: ");
                sc.nextLine();
            }
            x = sc.nextDouble();

            System.out.println("Enter value for Y: ");
            if (sc.hasNext("#")) {
                System.out.print("Stop");
                sc.close();
                break;
            }
            while (!sc.hasNextDouble()) {
                System.out.print("Enter value for Y: ");
                sc.nextLine();
            }
            y = sc.nextDouble();

            System.out.println("Enter Math sign: ");
            if (sc.hasNext("#")) {
                System.out.print("Stop");
                sc.close();
                break;
            }
           sign = sc.next();

            switch (sign) {
                case "+":
                    z = x + y;
                    break;
                case "-":
                    z = x - y;
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Can't divide by zero");
                    } else {
                        z = x / y;
                    }
                    break;
                case "*":
                    z = x * y;
                    break;
                default:
                    System.out.println("Incorrect sign");
                    break;
            }
            System.out.println("Result is: " + z);
        }
    }// Зачтено
}
