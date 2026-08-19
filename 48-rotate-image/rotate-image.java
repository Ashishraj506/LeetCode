class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int st=0;
            int ed=matrix[0].length-1;
            while(st<ed){
                int temp=matrix[i][st];
                matrix[i][st]=matrix[i][ed];
                matrix[i][ed]=temp;
                st++;
                ed--;

            }
            
        }

        
    }
}