import java.math.BigInteger;

public class Factorial {
    public static BigInteger getFactorial(BigInteger n) {
        if(n.compareTo(BigInteger.ONE) == 0 || n.compareTo(BigInteger.ZERO) == 0) return n;

        return n.multiply(getFactorial(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(new BigInteger("5")));
    }
}
