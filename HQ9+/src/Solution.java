import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        kb.close();
        if(s.contains("H")){
            System.out.println("YES");
        }else if(s.contains("Q")){
            System.out.println("YES");
        }else if(s.contains("9")){
            System.out.println("YES");
        }else if(s.contains("+")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
