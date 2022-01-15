package recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int num = 17355;

        System.out.println(sumDigits(num));
    }

    private static int sumDigits(int num) {

        if( num == 0) {
            return 0;
        }

//        int digit = num % 10;
//
//        int ans = digit + sumDigits(num/10);
//
//        return ans;

        return (num%10 + sumDigits(num/10));
    }

}
