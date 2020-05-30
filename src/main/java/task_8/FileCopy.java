package task_8;

import java.io.*;

public class FileCopy {

    public static void copy(String fileName, String copyFileName) {
        try(BufferedInputStream fileInputStream = new BufferedInputStream( new FileInputStream(fileName));
            BufferedOutputStream fileOutputStream = new BufferedOutputStream( new FileOutputStream(copyFileName))) {
            int read;
            while ((read = fileInputStream.read()) != - 1) {
                fileOutputStream.write(read);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при считывании");
        }
    }
}
