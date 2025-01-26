class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length){return mat;}
        int[] arr = new int[mat.length*mat[0].length];
        int[][] res = new int[r][c];
        int counter = 0;
        for(int i = 0;i<mat.length;i++)
        {
            for(int j = 0;j<mat[0].length;j++)
            {
                arr[counter] = mat[i][j];
                counter++;
            }
        }
        counter = 0;
       
        for(int i = 0;i<r;i++){
            if(counter>=arr.length) return res;
            for(int j = 0;j<c;j++)
            { 
                res[i][j] = arr[counter];
                counter++;
            }
        }
        return res;
    }
}