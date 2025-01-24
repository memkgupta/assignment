class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        int i = 0;
        int j = length-1;
        while(i<j)
        {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}