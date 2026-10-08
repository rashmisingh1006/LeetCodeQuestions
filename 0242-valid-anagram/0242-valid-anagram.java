class Solution {
    public boolean isAnagram(String s, String t) {


       
       if (s.length() != t.length())
       {
        return false;
       }

        Map<Character, Integer> frequencyS = new HashMap<>();
        Map<Character, Integer> frequencyM = new HashMap<>();

      for (char c : s.toCharArray())
      {
        frequencyS.merge(c, 1, Integer::sum);
      }

      for (char c : t.toCharArray())
      {
        frequencyM.merge(c, 1, Integer::sum);
      }


      if (frequencyS.equals(frequencyM))
      {
        return true;
      }

    else
    {
        return false;
    }

    }


}