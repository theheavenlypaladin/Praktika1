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
