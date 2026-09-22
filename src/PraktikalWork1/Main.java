package practicalwork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практическая работа №1");
    }
}

// Задание №3
package PraktikalWork1;

public class Task3 {
    public static void main(String[] args) {

        // Создание массива с помощью инициализации
        int[] numbers = {17, 23, 39, 41, 50};

        int sum = 0;

        // Вычисление суммы элементов
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}

// Задание №4
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

// Задание №5
package practicalwork1;

public class Task5 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}

// Задание №6
package practicalwork1;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("1/%d = %.4f%n", i, 1.0 / i);
        }
    }
}

// Задание №7
package practicalwork1;

public class Task7 {

    // Метод вычисления факториала
    public static long factorial(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        int number = 25;

        long result = factorial(number);

        System.out.println(
                number + "! = " + result
        );
    }
}
