import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        String str;
        int count=0;
        for(int i=0;!s.isBlank();i++){
            s=s.replaceAll(String.valueOf(s.charAt(i)), "");
            System.out.println(s);
            int len=s.length();
            System.out.println(len);
            count+=1;
            if(s.isBlank()){
                break;
            }
        }System.out.println(count);
    }
}
