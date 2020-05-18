package lesson03.Task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            task3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task3() throws IOException {
        final int PAGES = 1800;
        RandomAccessFile raf = new RandomAccessFile("src/lesson3/Task3/1.txt","r");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер страницы: ");
        int i = scanner.nextInt() - 1;
        raf.seek(i * PAGES);
        byte[] symbols = new byte[1800];
        raf.read(symbols);
        System.out.println(new String(symbols));
        raf.close();
    }
}
