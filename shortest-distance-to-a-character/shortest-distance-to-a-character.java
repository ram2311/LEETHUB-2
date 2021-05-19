class Solution {
    public int[] shortestToChar(String s, char c) {
         List<Integer> list = new ArrayList<>();
        int [] res = new int [s.length()];
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                res[i] = 0;
                temp = 0;
                continue;
            }else if(temp != Integer.MAX_VALUE){
                temp++;
            }
            res[i] = temp;
        }
        temp = Integer.MAX_VALUE;
        for(int i = s.length() - 1; i >= 0 ; i--){
            if(s.charAt(i) == c){
                res[i] = 0;
                temp = 0;
                continue;
            }else if(temp != Integer.MAX_VALUE){
                temp++;
            }
            res[i] = Math.min(res[i],temp);
        }
        return res;
    }
}