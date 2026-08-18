class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0;
        int high = 0;
        int minSubArraySize = Integer.MAX_VALUE;
        int currentSum = 0;

        while (high < nums.length)
        {
            currentSum = currentSum + nums[high];
            

            while (currentSum >= target)
            {
             int currentArraySize = high - low + 1 ;
              minSubArraySize = Math.min(minSubArraySize, currentArraySize);
              currentSum = currentSum - nums[low];
              low++;

            }
            high++;
        }

            return minSubArraySize == Integer.MAX_VALUE ? 0 : minSubArraySize;
    }
 }

 
