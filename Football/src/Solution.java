import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        if(s.contains("0000000") || s.contains("1111111")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        kb.close();
    }
}
