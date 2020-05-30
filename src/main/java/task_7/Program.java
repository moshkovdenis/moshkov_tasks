package task_7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();
        recursion(num);
    }

    public static int recursion(int num) {
        if (num < 1) {
            return 1;
        }
        System.out.print(num + " ");
        return recursion(num - 1);
    }
}
