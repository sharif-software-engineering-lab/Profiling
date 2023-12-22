import java.util.HashMap;

public class Fibonacci {
    private static final HashMap<Integer, Long> mem = new HashMap<Integer, Long>() {{
       put(0, 1L);
        put(1, 1L);
    }};

    private static long fib(int n) {
        if (!mem.containsKey(n))
            mem.put(n, fib(n-1) + fib(n-2));
        return mem.get(n);
    }

    public static void main(String[] args) {
        System.out.println(fib(46));
    }
}
