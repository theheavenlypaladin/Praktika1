package practicalwork1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        int i = 0;

        do {
            System.out.print("Введите элемент " + i + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < n);

        // Поиск суммы, максимума и минимума
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        i = 0;

        // Обработка массива с помощью while
        while (i < n) {

            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

            i++;
        }

        System.out.println("\nСумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        scanner.close();
    }
}