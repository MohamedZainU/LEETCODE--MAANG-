/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int findLongestConsecutiveSubsequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxCount = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }

                maxCount = Math.max(maxCount, currentCount);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 10,9,2,5,3,7,101,18};
        int longestConsecutiveSubsequence = findLongestConsecutiveSubsequence(arr);
        System.out.println("Length of longest consecutive subsequence: " + longestConsecutiveSubsequence);
    }
}
