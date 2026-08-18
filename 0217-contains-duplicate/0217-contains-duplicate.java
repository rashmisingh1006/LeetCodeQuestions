class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set1 = new HashSet<>();

        for(int seen : nums)
        {
            if (set1.contains(seen))
            {
                return true;
            }

        set1.add(seen);    

        }

        return false;
        
    }
}