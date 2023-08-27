public class ProductOfDigitsInNumber {
    public static int product(int n) {
        int lastDigit = n % 10;

        if(lastDigit == 0) return 1;

        return lastDigit * product(n/10);
    }

    public static void main(String[] args) {
        System.out.println(product(63966));
    }
}
