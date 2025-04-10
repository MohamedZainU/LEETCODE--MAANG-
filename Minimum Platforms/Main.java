/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;

public class Main {
    public static int calculateMinPlatforms(int at[], int dt[], int n) {
       if (n == 0) {
           return 0; 
       }

       Arrays.sort(at);
       Arrays.sort(dt);

       int i = 1, j = 0, count = 1, ans = 1;

       while (i < n && j < n) {
           if (at[i] > dt[j]) {
               j++;
               count--;
           } else {
               i++;
               count++;
           }
           ans = Math.max(ans, count);
       }
       return ans;
    }

    public static void main(String[] args) {
        // Sample Input 1
        int[] arrivals1 = {900, 940, 950, 1100, 1500, 1800};
        int[] departures1 = {910, 1200, 1120, 1130, 1900, 2000};
        int platforms = calculateMinPlatforms(arrivals1, departures1, arrivals1.length);
        System.out.println(platforms);

    }
}

