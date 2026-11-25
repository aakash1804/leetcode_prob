class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[2*n];

        int x = 0;
        int y = n;

        for(int i = 0; i < 2*n; i++) {
            if(i % 2 == 0) {
                a[i] = nums[x];
                x++;
            }
            else {
                a[i] = nums[y];
                y++;
            }
        }

        return a;
    }
}