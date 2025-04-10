/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
    static Queue<Integer> queue = new LinkedList<>();
    public static void hit(int time){
        queue.offer(time);
    }
    
    public static int getHit(int time){
        while(!queue.isEmpty() && time - queue.peek()>=300){
            queue.poll();
        }
        return queue.size();
    }
	public static void main(String[] args) {
		hit(1);
		hit(2);
		hit(3);
		System.out.println(getHit(4));
		hit(300);
		System.out.println(getHit(300));
		System.out.println(getHit(301));
	}
}
