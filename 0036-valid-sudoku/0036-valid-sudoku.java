class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for (int row = 0; row < 9 ; row++)
        {
            for (int col = 0; col < 9 ; col++)
            {
               char digit = board[row][col];

               if (digit == '.')
               { 
                continue ;
               }

               int box = (row / 3) * 3 + (col / 3);
               String rowKey = digit + " in row" + row;
               String colKey = digit + " in col"  + col;
               String boxKey = digit + " in box"  + box;

               if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey))
               {
                return false;
               }

            }
        }

        return true;
   }
}