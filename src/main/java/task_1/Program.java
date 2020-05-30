package task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Program {
    private static Random rnd = new Random();
    public static void main(String[] args) {
        int[] arr = rndArr();
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимально число в массиве " + maxNum(arr));
        System.out.println("Минимальное число в массиве " + minNum(arr));
        System.out.println("Среднее значение всех чисел " + averageNum(arr));
    }

    public static int[] rndArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length;i++){
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }
    public static int maxNum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length -1];
    }
    public static int minNum(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static int averageNum(int[] arr) {
        return (int) IntStream.of(arr).average().orElse(0);
    }
}
