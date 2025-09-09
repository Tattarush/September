package WorkDir090925;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {123, 324, 4, 212, 4, 235, 6, 42, 31};

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(fact(5));
    }


    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int fact(int n) {
        return (n == 0) ? 1 :n * fact(n - 1);
    }
}
