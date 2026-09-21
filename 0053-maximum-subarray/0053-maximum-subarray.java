class Solution {
    public int maxSubArray(int[] nums) {



        int current_sum = nums[0];
        int max_sum_so_far  = nums[0];

        for ( int i = 1 ; i < nums.length; i++)
        {
            int count = current_sum + nums[i];
            current_sum = Math.max(count, nums[i]);
            max_sum_so_far = Math.max(max_sum_so_far, current_sum);   
       }

       return max_sum_so_far;
      
   }
}