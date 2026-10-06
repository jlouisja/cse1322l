package Labs.Lab6;

public class FibFormula implements FindFib {
    public int calculateFib(int n) {
        if (n <= 1) {
            return n;
        }
        double gRatio = (1 + Math.sqrt(5)) / 2;
        double gRatioConjugate = (1 - Math.sqrt(5)) / 2;

        return (int) ((Math.pow(gRatio, n) - Math.pow(gRatioConjugate, n)) / Math.sqrt(5));
    }
    
}
