/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
    static int[] binarySearch(int matrix[][],int target,int row,int cStart,int cEnd){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    
    static int[] search(int matrix[][],int target){
        int rows = matrix.length;
        int col  = matrix[0].length;
        
        if(rows==1){
            binarySearch(matrix,target,0,0,col-1);
        }
        
        int rStart=0,rEnd = rows-1,Cmid = col/2;
        
        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][Cmid]==target){
                return new int[]{mid,Cmid};
            }
            if(matrix[mid][Cmid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        
        if(matrix[rStart][Cmid]==target){
            return new int[]{rStart,Cmid};
        }
        
        if(matrix[rStart+1][Cmid]==target){
            return new int[]{rStart+1,Cmid};
        }
        
        if(target <= matrix[rStart][Cmid-1]){
            return binarySearch(matrix,target,rStart,0,Cmid-1);
        }
        
        if(target >= matrix[rStart][Cmid+1] && target <= matrix[rStart][col-1]){
            return binarySearch(matrix,target,rStart,Cmid+1,col-1);
        }
        
        if(target <= matrix[rStart+1][Cmid-1]){
            return binarySearch(matrix,target,rStart+1,0,Cmid-1);
        }else{
            return binarySearch(matrix,target,rStart+1,Cmid+1,col-1);
        }
    }
    
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12}};
        int target = 12;
        System.out.println(Arrays.toString(search(matrix,target)));
	}
}
