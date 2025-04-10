/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
    
    public static boolean solve(String s, String t) {
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String res1 = new String(s1);
        String res2 = new String(s2);

        if(res1.equals(res2)){
            return true;
        }else{
            return false;
        }
    }
    
	public static void main(String[] args) {
		String s1 = "anagram";
        String s2 = "nagaram";
        boolean isTrue = solve(s1,s2);
        if(isTrue){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
	}
}
