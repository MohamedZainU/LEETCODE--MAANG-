/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int init(int arr[],int target){
        int peak = binary(arr);
        int first = orderBS(arr,target,0,peak);
        if(first!=-1){
            return first;
        }
        return orderBS(arr,target,peak+1,arr.length-1);
    }
    
    public static int orderBS(int arr[],int target,int start,int end){
        int ans = -1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }    
        return -1;
    }
    
    public static int binary(int arr[]){
        int start = 0,end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,3,1};
		int target = 3;
		System.out.println(init(arr,target));
	}
}
