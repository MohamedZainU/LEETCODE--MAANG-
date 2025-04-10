/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static boolean action(int[][] matrix,int[][] subMatrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int p = subMatrix.length;
        int q = subMatrix[0].length;
        
        for(int i=0;i<=m-p;i++){
            for(int j=0;j<=n-q;j++){
                if(isMatch(matrix,subMatrix,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public static boolean isMatch(int[][] matrix,int[][] subMatrix,int row,int col){
        int p = subMatrix.length;
        int q = subMatrix[0].length;
        
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                if(matrix[row+i][col+j]!=subMatrix[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		int[][] matrix = {
            {4,5,9},
            {1,3,5},
            {8,2,4}
        };

        int[][] subMatrix = {
            {5,9},
            {3,5}
        };
        
        boolean isTrue = action(matrix,subMatrix);
        if(isTrue){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
	}
}
