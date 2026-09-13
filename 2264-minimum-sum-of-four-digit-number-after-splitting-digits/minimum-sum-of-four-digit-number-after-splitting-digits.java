import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] a = new int[4];

        for (int i = 3; i >= 0; i--) {
            a[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(a);

        int n1 = a[0] * 10 + a[2];
        int n2 = a[1] * 10 + a[3];

        return n1 + n2;
    }
}