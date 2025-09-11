package WorkDir110925;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        int n = 100;
        long[] array = new long[n + 1];
        Arrays.fill(array, -1);
        System.out.println(fib(n, array));

    }


    //комбинированная версия вычисления числа фибоначчи
    public static long fib(int n, long[] array) {

        if (array[n] != -1) {
            return array[n];
        }

        if (n >= 0 & n <= 1) {
            return n;
        }
        long result = fib(n - 1, array) + fib(n - 2, array);
        array[n] = result;
        return result;
    }

}
