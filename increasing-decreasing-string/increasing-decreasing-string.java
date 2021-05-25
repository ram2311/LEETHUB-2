class Solution {
    public String sortString(String s) {
        char[] arr = new char[28];
        for(int i = 0; i < s.length(); i++){
            int x = s.charAt(i) - 'a' + 1;
            arr[x]++;
        }
        int t = 0;
        int k = 0;
        String result = "";
        while(result.length() < s.length()){
            if(arr[t] > 0){
                arr[t]--;
                result += (char) ('a' + t - 1);
            }
            if(t == 27){
                k = 1;
            }
            if(t == 0){
                k = 0;
            }
            if(k == 0){
                t++;
            }
            if(k == 1){
                t--;
            }
        }
        return result;
    }
}