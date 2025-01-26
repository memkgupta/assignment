class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat[0].length;
        int m = mat.length;
        int[] i = new int[]{0,0};
        int[] j = new int[]{0,n-1};
        int sum = 0;
        while(i[0]<m && i[1]<n && j[0]<m && j[1]>=0 )
        {
            int r = mat[i[0]][i[1]];
            int l = mat[j[0]][j[1]];
            if(i[0]==j[0] && i[1]==j[1]){
            sum+=l;

            }else{
                sum+=l+r;
            }
            i[0]++;
            i[1]++;
            j[0]++;
            j[1]--;
        }
        return sum;
    }
}