/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k=3,max=0;
		
		
		for(int i=0;i<=arr.length-k;i++){
		    max = arr[i];
		    for(int j=1;j<k;j++){
		        if(arr[i+j]>max){
		            max = arr[i+j];
		        }
		    }
		    System.out.print(max+" ");
		}
	}
}
