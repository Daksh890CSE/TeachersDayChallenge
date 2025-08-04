import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s1=kb.next().toLowerCase();
        String s2=kb.next().toLowerCase();
        if(s1.compareTo(s2)<0){
            System.out.println(-1);
        }else if(s1.compareTo(s2)>0){
            System.out.println(1);
        }
            
        
    }

}
