package Labs.Lab6;

public class FibIteration implements FindFib {
    public int calculateFib(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 0;
        int lastSeq = 1;
        int nextSeq = 0;

        for (int i = 2; i <= n; i++) {
            fib = lastSeq + nextSeq;
            nextSeq = lastSeq;
            lastSeq = fib;
        }

        return fib;
    }
}
