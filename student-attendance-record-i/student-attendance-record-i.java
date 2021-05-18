class Solution {
    public boolean checkRecord(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
            {
                count++;
            }
        }
        if(count>=2){
            return false;
        }
        if(s.length()<3){
            return true;
        }
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+3).equals("LLL"))
            {
                return false;
            }
        }
        return true;
    }
}