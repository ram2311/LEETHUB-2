class Solution {
    public String[] findWords(String[] words) {
        String fr = "qwertyuiopQWERTYUIOP";
        String sr = "asdfghjklASDFGHJKL";
        String tr = "zxcvbnmZXCVBNM";
        List<String> res = new ArrayList<>();
        for(String word:words){
            Boolean flag = true;
            String temp = fr;
            if(sr.indexOf(word.charAt(0)) >= 0){
                temp = sr;
            }else if(tr.indexOf(word.charAt(0)) >= 0){
                temp = tr;
            }
            for(int i=1; i<word.length(); ++i){
                if(temp.indexOf(word.charAt(i)) == -1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(word);
            }
        }
        String op[] = new String[res.size()];
        op = res.toArray(op);
        return op;
    }
}