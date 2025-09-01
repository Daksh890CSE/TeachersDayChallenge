import java.util.*;

public class Solution {
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        kb.close();
        int count=0;
        boolean istrue=false;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                istrue=true;
                count++;
            }else if(Character.isLowerCase(s.charAt(0)) && i==0){
                istrue=true;
            }else{
                istrue=false;
                break;
            }
        }if(istrue==true && count!=s.length()){
            s=s.toLowerCase();
            s=s.replaceFirst(String.valueOf(s.charAt(0)), String.valueOf(Character.toUpperCase(s.charAt(0))));
            System.out.println(s);
        }else if(istrue==true && count==s.length()){
            s=s.toLowerCase();
            System.out.println(s);
        }else{
            System.out.println(s);
        }
    }
}
