import java.util.*;

public class Solution {
    public static int minSteps(int x){
        if(x<=5){
            return 1;
        }else{
            return (x/5+1);
        }
    }
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int x=kb.nextInt();
        kb.close();
        System.out.println(minSteps(x));
    }
}
