//used km algorithm
class Solution {
    public int strStr(String haystack, String needle) {
 
     
       int j = 0;
       int m = needle.length();
        int[] prefixArr= new int[m];
        int len = 0; 
        int i = 1;

        while (i < m) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
               prefixArr[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = prefixArr[len - 1];
                } else {
                    prefixArr[i] = 0;
                    i++;
                }
            }
        }
       
int index = haystack.length();
 j = 0;
 i=0;
      while(i<haystack.length())
       {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            if(j==needle.length()){
              
                return i-j;
            }
            else if(i<haystack.length() && haystack.charAt(i)!=needle.charAt(j)){
              if(j!=0)
              {
                j = prefixArr[j-1];
              }
              else{
                i++;
              }
               
            }
            
       }
       return -1;
    }
}