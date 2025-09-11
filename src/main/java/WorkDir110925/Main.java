package WorkDir110925;

public class Main {
    public static void main(String[] args) {
     //   System.out.println(fib(10));
        System.out.println(goodFib(100));

    }
    //неэффективный метод вычисления числа Фибоначчи
//    public static long fib(int n) {
//        if (n >= 0 & n <= 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }

    //более эффективный метод
    public static long goodFib(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++)
            array[i] = array[i - 1] + array[i - 2];

        return array[n];
    }
}
