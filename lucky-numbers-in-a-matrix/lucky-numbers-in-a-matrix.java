class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        
        List<Integer> ans=new ArrayList<>();
        for(int[] i:matrix){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j:i){
                arr.add(j);
            }
            Collections.sort(arr);
            //System.out.prinlnt
            row.add(arr.get(0));
        }
        for(int i=0;i<matrix[0].length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<matrix.length;j++){
                arr.add(matrix[j][i]);
                
                
            }
            Collections.sort(arr);
            col.add(arr.get(arr.size()-1));
        }
        for(int i:row){
            if(col.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}