class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<int[]> zeroes = new ArrayList<int[]>();
        
        for(int m = 0; m < matrix.length; m++){
            for(int n = 0; n < matrix[0].length; n++){
                
                if(matrix[m][n] == 0){
                    int[] array = {m, n};
                    zeroes.add(array);
                }
            }
            
        }
        
        for(int i = 0; i < zeroes.size(); i++){
            
            int[] temp = new int[2];
            temp = zeroes.get(i);
            
            for(int n = 0; n < matrix[0].length; n++){
                matrix[temp[0]][n]=0;
            }
            
            for(int m = 0; m < matrix.length; m++){
                matrix[m][temp[1]]=0;
            }
        }
    }
}