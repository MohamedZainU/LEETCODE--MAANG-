/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        int curr = 0, max = Integer.MIN_VALUE; 

        for (int i = 0; i < a.length; i++) {
            curr += a[i];
            
            
            if (curr > max) {
                list.add(i);  //Add index not curr value
                max = curr;
            }
            
            if (curr < 0) {
                list.clear();
                curr = 0;
            }
        }
        System.out.println(max);
        
        for(int i=0;i<list.size();i++){
            System.out.print(a[list.get(i)]+" ");
        }
    }
}

