import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        int upper=0;
        int lower=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                lower+=1;
            }else if(Character.isUpperCase(s.charAt(i))){
                upper+=1;
            }
        }
    }
}
