package lesson03.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        task2();
    }

    private static void task2() throws IOException {
        ArrayList<InputStream> ali = new ArrayList<>();

        ali.add(new FileInputStream("src/lesson3/Task2/1.txt"));
        ali.add(new FileInputStream("src/lesson3/Task2/2.txt"));
        ali.add(new FileInputStream("src/lesson3/Task2/3.txt"));

        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ali));

        int x;
        while ((x = in.read()) != -1) {
            System.out.print((char)x);
        }
        in.close();
    }


}
