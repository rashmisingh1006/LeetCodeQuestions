class Solution {


    public int orangesRotting(int[][] grid) {

        if (grid == null || grid[0].length == 0)
        {
            return -1;
        }

       int rows = grid.length;
       int columns = grid[0].length;
       Queue<int[]> queue = new LinkedList<>();
       int freshOranges = 0;


 // step 1 : to calculate fresh oranges and rotten oranges and then adding rotten oranges coordinates to queue
       for (int i = 0; i < rows; i++)
       {
            for (int j = 0 ; j < columns; j++)
            {
                if (grid[i][j] == 2)
                {
                    queue.offer(new int[] {i,j});
                }

               else if (grid[i][j] == 1)
               {
                    freshOranges++;
               }
               
            }
       }

    /* step 2: to find minutes elapsed in converting all fresh oranges to rotten oranges.
    Like initially if there are three rotten oranges there coordinates will be added to queue. And then run a while loop till either queue is emptied or fresh Oranges are zero. And if there are three rotten oranges,
    all of these rotten oranges will affect the fresh oranges adjacent to them horizontally and perpendicularly.

    */

        int minutes = 0;
        int[][] directions = {{1,0}, {-1,0}, {0,1},{0,-1}};
    
 
        while (!queue.isEmpty() && freshOranges > 0)
        {
           int listSize = queue.size();
            for (int i = 0; i < listSize; i++)
            {
              int[] position = queue.poll();
              int x = position[0];
              int y = position[1];

              for (int[] dir : directions)
              {
                  int newx = x + dir[0];
                  int newy = y + dir[1]; 
                  if (newx >= 0 && newx < rows && newy >= 0 && newy < columns
                        && grid[newx][newy] == 1)
                        {
                           grid[newx][newy] = 2;
                           freshOranges--;
                           queue.offer(new int[] {newx, newy});

                        }
               
                }
            }

            minutes++;
        } 

        return freshOranges == 0 ? minutes : -1;

        }


       }





























