class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=9;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int k=0;
                int c=0;
                if(matrix[i][j]==0){
                    while(k!=row){
                        arr[k][j]=0;
                        k++;
                    }
                    while(c!=col){
                        arr[i][c]=0;
                        c++;
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]!=0){
                    arr[i][j]=matrix[i][j];
                }
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}