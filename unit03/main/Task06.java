package by.epam.unit03.main;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int x =sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int y =sc.nextInt();
        int digitX;
        int digitY;

        System.out.print("Common digits found for 1st and 2nd numbers are: ");
        for (int i = x; i > 0; i = i / 10) {
            digitX = i % 10;
            for (int i1 = y; i1 > 0; i1 = i1 / 10) {
                digitY = i1 % 10;
                if (digitX == digitY) {
                    System.out.print(digitX + " ");
//Здесь я бы еще добавила логику проверки на уникальность, но для этого предполагаю, надо уже использовать массив
//Также я бы добавила логику, если нет совпадений, выводить сообщение "Совпадений не найдено", но пока не получилось красиво сделать
                }
            }
        }
    }
}
