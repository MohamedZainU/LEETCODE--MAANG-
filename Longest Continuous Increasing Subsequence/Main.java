/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
        public static int findLengthOfLCIS(int[] nums) {
            int start = 0;
            int res = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i - 1] >= nums[i]) {
                    start = i;
                }
                res = Math.max(res, i - start + 1);
            }
            return res;
        }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        int longestIncreasingLength = findLengthOfLCIS(nums);
        System.out.println("Longest Continuous Increasing Subsequence Length: " + longestIncreasingLength);
    }
}

