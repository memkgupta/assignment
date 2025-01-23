class Solution {
    public int[] plusOne(int[] digits) {
       int carry = 1;
       int i = digits.length-1;
       while(carry>0&&i>=0){
            digits[i]+=carry;
            if(digits[i]>9){
                carry = 1;
            }
            else{
                carry = 0;
            }
            digits[i] = digits[i]%10;
            i--; 
       }
      
       if(carry>0)
       {
         int[] newRes = new int[digits.length+1];
         newRes[0]=1;
        for(i = 1;i<digits.length+1;i++)
        {
            newRes[i] = digits[i-1];
        }
        return newRes;
       }
       return digits;
    }
}