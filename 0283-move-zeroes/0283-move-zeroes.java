class Solution {
    public void moveZeroes(int[] nums) {


        int nextNonZero = 0;

        for (int i = 0; i < nums.length ; i++)
        {
           if (nums[i] != 0)
           {
                 int temp = nums[nextNonZero];
                 nums[nextNonZero] = nums[i];
                 nums[i] = temp;
                 nextNonZero++;

           }


        }

        
    }
}