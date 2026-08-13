public class Solution {
    public int[] twoSum(int[] nums, int target) {

  Map<Integer, Integer> mapset = new HashMap<>();
  for(int i=0; i<nums.length; i++)
  {
    int complement = target - nums[i];
    if (mapset.containsKey(complement))
    {
           return new int[]{mapset.get(complement),i};

    }
    mapset.put(nums[i],i);

  }
throw new IllegalArgumentException ("No two sum solution");
    }
}

