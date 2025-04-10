/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Base case: Check if the input array has at least 3 elements.
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;
            
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[start], nums[end], nums[i]));
                    
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> output = threeSum(nums);
        
        for(List<Integer> list:output){
            System.out.println(list);
        }
    }
}

