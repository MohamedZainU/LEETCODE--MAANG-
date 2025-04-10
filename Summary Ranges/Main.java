/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] = {0,1,2,4,5,7};
		List<String> res = new ArrayList<>();
		
		for(int i=0;i<arr.length;){
		    int st = i;
		    int en = i;
		    
		    while(en+1 < arr.length && arr[en]+1==arr[en+1]){
		        en++;
		    }
		    if(en>st){
		        res.add(""+arr[st]+"->"+arr[en]);
		    }else{
		        res.add(""+arr[st]);
		    }
		    st = en;
		    i = en + 1;
		}
		System.out.println(res);
	}
}
