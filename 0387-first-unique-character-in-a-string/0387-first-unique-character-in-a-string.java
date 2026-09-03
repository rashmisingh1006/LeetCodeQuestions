class Solution {
    public int firstUniqChar(String s) {

        Map<Character,Integer> frequencycount = new LinkedHashMap<>();

        for (char a : s.toCharArray())

        {
            frequencycount.merge(a, 1, Integer::sum);

        }

        for (int i = 0;  i < s.length(); i++)
        {
            if (frequencycount.get(s.charAt(i)) == 1)
            {
                return i;
            }

        }

        return -1;
         







        
    }
}