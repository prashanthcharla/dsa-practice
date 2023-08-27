public class SumOfDigitsInNumber {
    public static int sum(int n) {
        if(n == 0) return n;

        int lastDigit = n % 10;
        return lastDigit + sum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(1345));
    }
}
