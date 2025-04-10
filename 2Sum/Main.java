/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int num[] = {2,7,11,15};
		int target = 9;
		
		List<int[]> res = new ArrayList<>();
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<num.length;i++){
		    int comp = target - num[i];
		    if(map.containsKey(comp)){ //
		        res.add(new int[]{map.get(comp),i});
		    }
		    map.put(num[i],i);
		}
		
		for(int[] pair:res){ //
		    System.out.println(Arrays.toString(pair));
		}
	}
}
