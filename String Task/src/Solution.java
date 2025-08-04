import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb =new Scanner(System.in);
        String s=kb.next();
        String regex="[aeiouAEIOU]";
        s=s.toLowerCase();
        s=s.replaceAll(regex,"");
        System.out.println(s);
    }

}
