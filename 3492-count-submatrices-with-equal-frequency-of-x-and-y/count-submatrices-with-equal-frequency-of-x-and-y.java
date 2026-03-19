class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] sumx = new int[col];
        int[] sumy = new int[col];
        int res =0;
        for(int i=0; i<row; i++){
            int rx =0, ry =0;
            for(int j=0; j<col; j++){
                if(grid[i][j] == 'X') rx++;
                else if(grid[i][j] == 'Y') ry++;

                sumx[j] += rx;
                sumy[j] += ry;
                if(sumx[j] >0 && sumx[j] == sumy[j]) res++;
            }
        }
        return res;
    }
}