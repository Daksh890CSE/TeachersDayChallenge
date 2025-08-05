import java.util.*;

public class Solution {
        public static void main(String[] args){
            Scanner kb=new Scanner(System.in);
            String s=kb.nextLine();
            if(Character.isLowerCase(s.charAt(0))){
                s=s.replace(String.valueOf(s.charAt(0)),String.valueOf(Character.toUpperCase(s.charAt(0))));
            }
            System.out.println(s);
            kb.close();
        }
}
