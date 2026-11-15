class Solution {
    public int pivotIndex(int[] nums) {

        int lsum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rsum = 0;

            for (int j = i + 1; j < nums.length; j++) {
                rsum += nums[j];
            }

            if (lsum == rsum) {
                return i;
            }

            lsum += nums[i];
        }

        return -1;
    }
}