class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
          if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        List<Integer> result = new ArrayList<>();

    
        for (int i = 0; i < m + n - 1; i++) {
           
            int r = (i < n) ? 0 : i - n + 1; 
            int c = (i < n) ? i : n - 1; 

        
            List<Integer> diagonal = new ArrayList<>();
            while (r < m && c >= 0) {
                diagonal.add(mat[r][c]);
                r++;
                c--;
            }
            if (i % 2 == 0) {
                Collections.reverse(diagonal);
            }

            result.addAll(diagonal);
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}