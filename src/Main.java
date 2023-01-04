import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] app = {3, 2, 1, 6, 5, 7};
        invert(app);
        System.out.println(Arrays.toString(app));
        System.out.println();
    }

    public static void invert(int[] method) {
        int a;
        for (int i = 0, j = method.length - 1; i < method.length / 2; i++, j--) {
            a = method[i];
            method[i] = method[j];
            method[j] = a;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        String abc = "abcdefghijk";
        haveDuplicate(abc);
        System.out.println();
    }

    public static void haveDuplicate(String text) {
        String[] textLetters = text.split("");
        for (int i = 0; i < textLetters.length; i++) {
            for (int j = i + 1; j < textLetters.length; j++) {
                if (textLetters[i].equals(textLetters[j])) {
                    System.out.println("В тексте продублирован символ " + textLetters[i]);
                    return;
                }
            }
        }
        System.out.println("В тексте нет продублированных символов");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        System.out.println("Среднее значение "+middleValue(arr));
    }

    public static float middleValue(int[] arr) {
        float days = arr.length;
        float middleValue = sumValue(arr)/days;
        return middleValue;
    }

    public static float sumValue(int[] arr) {
        float sum = 0f;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}