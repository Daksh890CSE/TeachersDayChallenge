import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        String s1=kb.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        if(rev==s1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
