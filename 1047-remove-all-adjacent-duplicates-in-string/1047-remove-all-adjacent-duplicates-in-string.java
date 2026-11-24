class Solution {
    public String removeDuplicates(String str) {

    StringBuilder result = new StringBuilder();

    for (char ch : str.toCharArray())
    {

        int length = result.length();

        if (length > 0 && result.charAt(length - 1) == ch )
        {
            result.deleteCharAt(length - 1);
        }

        else

        {
            result.append(ch);
        }

    }

    return result.toString();


}
}