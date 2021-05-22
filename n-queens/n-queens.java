class Solution {
    int n;
    List<List<String>> combinations = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;++j){
                board[i][j]='.';
            }
        }
        backtrack(0,new HashSet<>(), new HashSet<>(), new HashSet<>(), board);
        return combinations;
    }
    
    public List<String> addtoAnswerList(char board[][]){
        List<String> ans = new ArrayList<String>();
        for(int i=0;i<n;++i)
            ans.add(new String(board[i]));
        return ans;
    }
    
    public void backtrack(int row, Set<Integer> column, Set<Integer> diagonals, Set<Integer> antidiagonals, char[][] board){
        
        if(row==n){
            combinations.add(addtoAnswerList(board));
            return;
        }
        
        for(int col=0;col<n;++col){
            int currDiagonal = row-col;
            int antiDiagonal = row+col;
            
            if(column.contains(col) || diagonals.contains(currDiagonal) || antidiagonals.contains(antiDiagonal)) continue;
            
            column.add(col);
            diagonals.add(currDiagonal);
            antidiagonals.add(antiDiagonal);
            board[row][col]='Q';
            
            backtrack(row+1,column,diagonals,antidiagonals,board);
            
            column.remove(col);
            diagonals.remove(currDiagonal);
            antidiagonals.remove(antiDiagonal);
            board[row][col]='.';
        }
        
        
        
    }
}