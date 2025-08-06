import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isWhitespace(s.charAt(i))){
                continue;
            }
            s=s.replaceAll(String.valueOf(s.charAt(i)), " ");
            count+=1;
            if(s.isBlank()){
                break;
            }
        }if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        kb.close();
    }
}
