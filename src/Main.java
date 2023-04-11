import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int expenses = 0;
        for (int i : arr) {
            expenses += i;
        }
        System.out.println("Сумма трат за месяц составила " + expenses + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxExpenses = arr[0];
        int minExpenses = arr[0];
        for (int i : arr) {
            if (i > maxExpenses) {
                maxExpenses = i;
            }
            if (i < minExpenses) {
                minExpenses = i;
            }

        }
        System.out.print(Arrays.toString(arr));
        System.out.println(" ");
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int expenses = 0;
        for (int i : arr) {
            expenses += i;
        }
        double averageValue = expenses / arr.length;
        System.out.println("Средняя сумма трат за месяц составила … рублей " + averageValue);
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 11; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
