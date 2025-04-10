/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
    static void merge(int arr[],int start,int mid,int end){
        int i=start,j=mid,k=0;
        int ans[] = new int[end-start];
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                ans[k++] = arr[i];
                i++;
            }else{
                ans[k++] = arr[j];
                j++;
            }
        }
        
        while(i<mid){
            ans[k++] = arr[i];
            i++;
        }
        
        while(j<end){
            ans[k++] = arr[j];
            j++;
        }
        
        for(int l=0;l<ans.length;l++){
            arr[start+l] = ans[l];
        }
    }
    
    static void mergeSort(int arr[],int start,int end){
        if(end-start==1){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }
	public static void main(String[] args) {
		int arr[] = {1,4,3,5,2};
		mergeSort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
}