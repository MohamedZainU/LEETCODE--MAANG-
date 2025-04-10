/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int R;
    static int C;
    
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
    
    public static boolean searchOf(char grid[][],int row,int col,String word){
        if(grid[row][col]!=word.charAt(0)){
            return false;
        }
        
        for(int dir=0;dir<8;dir++){
            int k,rd = row + x[dir],cd = col + y[dir];
            
            for(k=1;k<word.length();k++){
                if(rd<0 || rd>=R || cd<0 || cd>=C){
                    break;
                }
                
                if(grid[rd][cd]!=word.charAt(k)){
                    break;
                }
                rd += x[dir];
                cd += y[dir];
            }
            if(k==word.length()){
                return true;
            }
        }
        return false;
    }
    
    public static void search(char grid[][],String word){
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==word.charAt(0) && searchOf(grid,i,j,word)){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
    
	public static void main(String[] args) {
		R = 3;
        C = 13;
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                        { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                        { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
        
        search(grid,"GEEKS");                
	}
}
