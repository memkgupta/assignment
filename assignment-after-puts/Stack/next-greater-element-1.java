class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
         HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int i = nums2.length-1;i>=0;i--){
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
                stack.push(nums2[i]);
            }
            else{
                while(!stack.isEmpty()&&stack.peek()<nums2[i]){
                    stack.pop();
                }
               if(!stack.isEmpty()){
     map.put(nums2[i],stack.peek());
               }
             else{
     map.put(nums2[i],-1);

             }
                stack.push(nums2[i]);

                
            }
        }
        
       

       
int[] ans = new int[nums1.length];
        for(int e = 0;e<nums1.length;e++){
ans[e] = map.get(nums1[e]);
        }
        return ans;
    }
}