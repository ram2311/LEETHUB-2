class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        int l = 0;
        int ans = 0;
        
        for(int r = 0; r < n; r++){
            if(map.containsKey(nums[r]) == true){
                int index = map.get(nums[r]);
                while(l < r && l <= index){
                    sum -= nums[l];
                    l++;
                }
            }
            
            map.put(nums[r], r);
            sum += nums[r];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}