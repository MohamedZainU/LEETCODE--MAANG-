/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n = 5;
		System.out.println("1");
		String s = "1";
		int i = 1;
		while(i<n){
		    int count = 1;
		    char a = s.charAt(0);
		    String new_str = "";
		    for(int j=1;j<s.length();j++){
		        if(s.charAt(j)!=s.charAt(j-1)){
		            System.out.print(count+""+a);
		            new_str += "" + count + "" + a;
		            a = s.charAt(j);
		            count = 1;
		        }else{
		            count++;
		        }
		    }
		    System.out.println(count+""+a);
		    new_str += "" + count + "" + a;
		    s = new_str;
		    i++;
		}
	}
}
