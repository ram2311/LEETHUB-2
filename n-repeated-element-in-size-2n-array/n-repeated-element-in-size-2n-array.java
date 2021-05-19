class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i])==false)
            {
                h.put(nums[i],1);
            }
            else
            {
                return nums[i];
            }
        }
        return 0;
        
    }
}