/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int nums[] = {10,9,2,5,3,7,101,18};
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int max = 0;
        for(int n:dp){
            max = Math.max(max,n);
        }
        System.out.println(max);
	}
}
