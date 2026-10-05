class Solution {
    public int[][] updateMatrix(int[][] mat) {



    int rows = mat.length;
    int cols = mat[0].length;
    int[][] outputMatrix = new int[rows][cols];
    Queue<int[]> queue = new LinkedList<>();


    for (int i = 0; i < rows; i++)
    {
         for (int j = 0; j < cols; j++)
         {

           if (mat[i][j] == 0)
           {
            queue.offer(new int[]{i,j});
            outputMatrix[i][j] = 0;
           }

           else
           {
            outputMatrix[i][j] = -1;
           }
         }
    }

    int[][] directions = {{1,0},{-1,0}, {0,1},{0,-1}};
    int distance = 1;

    while (!queue.isEmpty())
    {
        int listSize = queue.size();

        for (int i = 0; i< listSize; i++)
        {
          int[] position = queue.poll();
          int x = position[0];
          int y = position[1];

          for (int[] dir : directions)
          {
               int newx = x + dir[0];
               int newy = y + dir[1];

               if (newx >= 0 && newx < rows && newy >= 0 && newy < cols 
                   && outputMatrix[newx][newy]  == -1)
                   {
                      outputMatrix[newx][newy] = distance;
                      queue.offer(new int[]{newx, newy});

                   }


           }

        }

        distance++;
    }

    return outputMatrix;
      

        
    }
}