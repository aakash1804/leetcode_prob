class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
         int n=0;
         for(int i=0;i<nums.length;i++){
              int temp=nums[i];
               a[n]=temp*temp;
                 n++;
         }
         Arrays.sort(a);
            return a;
    }
}