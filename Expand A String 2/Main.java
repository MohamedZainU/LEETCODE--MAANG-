/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int num = 0;
		String s = "a11b12";
		char c;
		for(int i=1;i<s.length();i++){
		    num = 0;
		    if(Character.isDigit(s.charAt(i))){
		        c = s.charAt(i-1);
		        int j = i;
		        while( j<s.length() && Character.isDigit(s.charAt(j))){
		            num = num * 10 + (s.charAt(i)-'0');
		            j++;
		        }
		        
		        for(int k=0;k<num;k++){
		            System.out.print(c);
		        }
		        i = j - 1;
		    }
		}  
	}
}
