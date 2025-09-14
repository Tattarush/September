package workDir140925;

import java.math.BigInteger;

public class Second {
    public static void main(String[] args) {


        System.out.println(fibo2(1000));

    }

    public static long fibo(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static BigInteger fibo2(int n) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        if (n == 0) return first;
        if (n == 1) return second;

        for (int i = 2; i <= n; i++) {
            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
        return second;
    }
}
