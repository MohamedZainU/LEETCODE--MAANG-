/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String digits = "23";
		String phNo[] = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		LinkedList<String> list = new LinkedList<>();
		if(digits.length()==0){
		    System.out.println("");
		    return;
		}
		
		list.add("");
		
		
		for(int i=0;i<digits.length();i++){
		    int index = Character.getNumericValue(digits.charAt(i));
		    while(list.peek().length()==i){
		        String permute = list.remove();
		        for(char c:phNo[index].toCharArray()){
		            list.add(permute+c);
		        }
		    }
		}
		
		System.out.println(list);
		
	}
}
