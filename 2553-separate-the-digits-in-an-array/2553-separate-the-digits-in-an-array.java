class Solution {
    public int[] separateDigits(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp > 0) {
                n++;
                temp = temp / 10;
            }
        }
        int[] a = new int[n];
        int k = n - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            while (temp > 0) {
                int dig = temp % 10;
                a[k--] = dig;
                temp = temp / 10;
            }
        }
        return a;
    }
}