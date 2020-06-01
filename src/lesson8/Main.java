package lesson8;

public class Main {
    static int num = 1;
    public static void main(String[] args) {
        int[][] arr = fillArrayWithZeros();

        spiralMethod(arr, 0, arr.length);

        showArray(arr);

    }

    private static int[][] fillArrayWithZeros() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 0;
            }
        }
        return arr;
    }

    static void spiralMethod(int[][] array, int num1, int num2) {
        int count = 0;

        if (checkEmptyCell(array, count) == 0) {
            return;
        }

        fillArray(array, num1, num2);

        System.out.println();
        spiralMethod(array, ++num1, --num2);
    }

    private static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int checkEmptyCell(int[][] array, int count) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void fillArray(int[][] arr,int num1, int num2) {
        for (int j = num1; j < num2; j++) {
            arr[num1][j] = num;
            num++;
        }

        for (int i = num1 + 1; i < num2; i++) {
            arr[i][num2 - 1] = num;
            num++;
        }

        for (int j = num2 - 2; j > num1 - 1; j--) {
            arr[num2 - 1][j] = num;
            num++;
        }

        for (int i = num2 - 2; i > num1; i--) {
            arr[i][num1] = num;
            num++;
        }
    }
}
