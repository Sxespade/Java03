package lesson6;

public class CheckOneOrFour {

    public boolean checkOneOrFour(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value == 1 || value == 4) {
                count++;
            }
        }
        return count > 0;
    }
}
