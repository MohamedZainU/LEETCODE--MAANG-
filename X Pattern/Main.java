/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String s = "programming";
		
		for(int i=0;i<s.length();i++){
		    for(int j=0;j<s.length();j++){
		        if(i==j || i+j==s.length()-1){
		            System.out.print(s.charAt(j));
		        }else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}