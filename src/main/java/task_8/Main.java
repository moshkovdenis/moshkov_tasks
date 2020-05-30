package task_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите директорию и имя файла");
        String fileNameDer = new Scanner(System.in).nextLine();
        System.out.println("Введите директорию и имя файла, где сохраниться копия файла");
        String copyFileNameDer = new Scanner(System.in).nextLine();
       FileCopy.copy(fileNameDer, copyFileNameDer);
    }
}
