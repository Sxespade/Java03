package lesson6;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class ExtractingArray {

    public int[] extractingArray(int[] array) throws RuntimeException {
        int last4 = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                last4 = i;
                count++;
            }
        }
        if (count == 0) {
            throw new RuntimeException();
        } else {
            int[] array2 = Arrays.copyOfRange(array, last4 + 1, array.length);
            return array2;
        }
    }
}
