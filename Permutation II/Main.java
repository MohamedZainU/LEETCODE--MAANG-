/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static List<String> generate(String s){
        List<String> res = new ArrayList<>();
        backtrack(0,s.toCharArray(),res);
        return res;
    }
    
    public static void backtrack(int index,char[] s,List<String> res){
        if(index==s.length){
            res.add(new String(s));
        }
        
        for(int i=index;i<s.length;i++){
            swap(i,index,s);
            backtrack(index+1,s,res);
            swap(i,index,s);
        }
    }
    
    public static void swap (int i,int j,char[] s){
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
    }
    
    
    
	public static void main(String[] args) {
		String s = "zainu";
		List<String> result = generate(s);
		for(String str:result){
		    System.out.println(str);
		}
	}
}
