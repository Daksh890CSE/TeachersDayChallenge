import java.util.*;

public class Solution {
        public static void main(String[] args){
            Scanner kb=new Scanner(System.in);
            String s=kb.nextLine();
            s=s.replaceFirst(String.valueOf(s.charAt(0)),String.valueOf(Character.toUpperCase(s.charAt(0))));
            System.out.println(s);
            kb.close();
        }
}
