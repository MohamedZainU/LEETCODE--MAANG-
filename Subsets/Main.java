/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
    public static void subset(int[] arr,int index,List<Integer> curr){
        if(index==arr.length){
            System.out.println(curr);
            return;
        }
        
        curr.add(arr[index]);
        subset(arr,index+1,curr);
        curr.remove(curr.size()-1);
        subset(arr,index+1,curr);
    }
    
    
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		subset(arr,0,new ArrayList<>());
	}
}
