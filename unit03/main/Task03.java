package by.epam.unit03.main;

public class Task03 {
    public static void main(String[] args) {
        int sum = 0;
        long result = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            result = sum * result;
        }
        System.out.println("Result is " + result);
    }
}
