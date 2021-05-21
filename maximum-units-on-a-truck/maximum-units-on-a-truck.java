class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         int sum = 0;
        
        Arrays.sort(boxTypes, new Comparator<int[]>() { 
          @Override              
          public int compare(int[] entry1, int[] entry2) { 
  
            if (entry1[1] > entry2[1]) 
                return -1; 
            else 
                return 1;
          } 
        });
        
//         for (int i = 0; i < boxTypes.length; i++) {            
//             for (int j = 0; j < boxTypes[i].length; j++)
//                 System.out.println(boxTypes[i][j] + " ");
//             System.out.println();
//         }
        
        for (int i = 0; i < boxTypes.length; i++) { 
            
            int num_boxes = boxTypes[i][0];
            int num_units = boxTypes[i][1];
            int j = 1;
            while(truckSize > 0 && j <= num_boxes) {
                
                sum += num_units;
//              System.out.println("Num of boxes : " + j + " Num of units : " + num_units + " Sum : " + sum + "\n");  
                j++;
                truckSize--;
            }
        }
        return sum;
    }
}