/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void rearrange(int nums[],int start){
        int end = nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    
	public static void main(String[] args) {
		int nums[] = {3,2,1};
		int i=nums.length-2;
		
		while(i>=0 && nums[i]>=nums[i+1]){
		    i--;
		}
		
		if(i>=0){
		    int j=nums.length-1;
		    
		    while(j>=0 && nums[j]<=nums[i]){
		        j--;
		    }
		    swap(nums,i,j);
		}
		rearrange(nums,i+1);
		System.out.println(Arrays.toString(nums));
	}
}
