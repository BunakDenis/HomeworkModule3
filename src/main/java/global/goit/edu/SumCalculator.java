package global.goit.edu;

public class SumCalculator {

    public int sum (int n) {
        int result = 0;

        if (n == 0) {
            throw new IllegalArgumentException("Invalid input value " + n);
        }

            for (int i = 1; i <= n; i++) {
                result += i;
            }
            System.out.println("result = " + result);
            return result;
    }
}
