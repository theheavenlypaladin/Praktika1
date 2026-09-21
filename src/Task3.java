package practicalwork1;

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