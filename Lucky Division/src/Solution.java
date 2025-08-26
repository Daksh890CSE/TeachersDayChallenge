import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        String s=String.valueOf(n);
        if(n%4==0 || n%7==0){
            System.out.println("YES");
        }else if(s.contains("4") || s.contains("7")){
            s=s.replaceAll("^[47]+$", s)
        }
    }
}
