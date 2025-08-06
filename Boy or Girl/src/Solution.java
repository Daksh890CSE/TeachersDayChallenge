import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        String str;
        int count=0;
        for(int i=0;i<s.length();i++){
            s=s.replaceAll(String.valueOf(s.charAt(i)), "");
            System.out.println(s);
            count+=1;
            if(s.isEmpty()){
                break;
            }
        }System.out.println(count);
    }
}
