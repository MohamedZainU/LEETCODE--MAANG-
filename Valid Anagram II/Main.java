/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cbb";
		boolean isTRue = true;
		
		int charC[] = new int[26];
		
		for(char c:s1.toCharArray()){
		    charC[c-'a']++;
		}
		
		for(char c:s2.toCharArray()){
		    charC[c-'a']--;
		    if(charC[c-'a']<0){
		        isTRue = false;
		    }
		}
		
		if(isTRue){
		    System.out.println("True");
		}else{
		    System.out.println("False");
		}
	}
}
