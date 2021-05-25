package by.epam.unit03.main;

public class Task02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 99) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers in range 1-99 is " + sum);
    }
}
