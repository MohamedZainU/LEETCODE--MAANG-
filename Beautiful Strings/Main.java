/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {

    public static String funnyString(String s){
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(Math.abs(s.charAt(i) - s.charAt(i+1)) != Math.abs(s.charAt(n-i-1)-s.charAt(n-i-2))){
                return "True";
            }
        }
        return "False";
    }

    public static void main(String[] args) {
        System.out.println(funnyString("lmnop"));
        System.out.println(funnyString("bcxz"));
    }
}

