/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Solution {
    
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int ans=1;

        int j=0,i=1,count=1;
        while(j<n && i<n){
            if(at[i]>dt[j]){
                count--;
                j++;
            }else{
                count++;
                i++;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
