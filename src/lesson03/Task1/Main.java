package lesson03.Task1;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        try (FileInputStream in = new FileInputStream("src/lesson3/Task1/text.txt")) {
            byte[] arr = new byte[512];
            int x;
            while ((x = in.read(arr)) > 0) {
                System.out.print(new String(arr, 0, x));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
