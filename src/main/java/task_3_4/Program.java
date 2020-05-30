package task_3_4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String str = "";
        do {
            System.out.println("Введите слово начинающиеся на букву А");
            str = new Scanner(System.in).nextLine();
        } while (!str.startsWith("А"));
        System.out.println("Спасибо, хорошего дня!");
    }
}
