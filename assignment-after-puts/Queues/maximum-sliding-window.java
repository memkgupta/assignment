class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        if(nums.length==1)return nums;
        int[] res = new int[nums.length-k+1];
        int i = 0;
        while(i<nums.length)
        {
            while(!q.isEmpty() && q.peekFirst()<=(i-k))
            {
                q.poll();
            }
            while(!q.isEmpty()&&nums[q.peekLast()]<=nums[i])
            {
                q.removeLast();
            }
            q.offer(i);
            if(i-(k-1)>=0 && (i-(k-1))<res.length && !q.isEmpty())
            {
            res[i-(k-1)] = nums[q.peekFirst()];
            }
i++;
        }
        return res;
    }
}