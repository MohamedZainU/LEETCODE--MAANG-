/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashSet<Character> set = new LinkedHashSet<>();
		String s = "occurence";
		StringBuilder res = new StringBuilder();
		int count[] = new int[26];
		
		for(char c:s.toCharArray()){
		    set.add(c);
		}
		
		
		
		for(char c:set){
		    res.append(c);
		}
		
		for(int i=0;i<s.length();i++){
		    count[s.charAt(i)-'a']++;
		}
		int i=0;
		while(i<res.length()){
		    System.out.println(res.charAt(i)+" "+count[res.charAt(i)-'a']);
		    i++;
		}
	}
}
