class Solution {
    public int triangleNumber(int[] nums) {

        Arrays.sort(nums);
        int count = 0;

   

        for (int k = nums.length - 1; k >= 2; k--)
        {
     
              int left = 0;
              int right = k - 1;

           while (left < right)
           {

            int twosides = nums[left] + nums[right];

            if (twosides > nums[k])
            {
               count += right - left;
               right --;


            }

            else 
            {
                left++;
            }

           }

        }

        return count;

}
}





    
