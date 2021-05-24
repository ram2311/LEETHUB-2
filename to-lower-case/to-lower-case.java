class Solution {
    public String toLowerCase(String s) {
        String lowerCase = "";
        for(char c : s.toCharArray()){
           lowerCase = lowerCase + ( c>='A'&& c<='Z' ? (char)(c+32) : c);
        }
        return lowerCase;
    }
}