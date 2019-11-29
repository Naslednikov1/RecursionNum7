public class DZ {
    private static long i, counter92 = 0, counter94 = 1, max = 1, n = 1;
    public static long N7_92(long a, long n){
        if (n == 0){
            return counter92;
        } else {
            counter92 += a;
            n--;
            return N7_92(a, n);
        }
    }
    public static long N7_94(long a, long n){
        if (n == 0){
            return counter94;
        } else {
            counter94 *= a;
            n--;
            return N7_94(a, n);
        }
    }
    public static long N7_109(long x, long y){
        if (n > x || n > y){
            return max;
        } else {
            if (x % n == 0 && y % n == 0){
                max = n;
            }
            n++;
            return N7_109(x, y);
        }
    }
}