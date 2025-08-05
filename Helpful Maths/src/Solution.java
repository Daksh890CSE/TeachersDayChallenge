import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        String fnl="";
        try{
        if(s.length()==1){
            System.out.println(s);
        }
        }catch(Exception e){}
        String[] str=s.split("\\+");
        int[] num=new int[str.length];; 
        for(int i=0;i<str.length;i++){
            num[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            fnl=fnl+String.valueOf(num[i]);
        }
        System.out.println(fnl);
        
    }
}
