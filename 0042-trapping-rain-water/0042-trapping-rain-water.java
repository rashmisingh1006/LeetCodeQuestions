class Solution {
    public int trap(int[] heights) {

   if (heights.length == 0)
   {
    return 0;
   }
    
    int left = 0;
    int right = heights.length - 1;
    int leftMax = heights[left];
    int rightMax = heights[right];
    int count = 0;

    while (left < right)
    {
        if (leftMax < rightMax)
        {
            left++;
            if (leftMax < heights[left])
            {
               leftMax = heights[left];

            }

            else 
            {
                count += leftMax - heights[left];
            }
        }
        else
        {
          right--;
          if (rightMax < heights[right])
          {
            rightMax = heights[right];
          }
          else
          {
            count += rightMax - heights[right];
          }
        }
    }
    return count;
   }
}


       



     










        
