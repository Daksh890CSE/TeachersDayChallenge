import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        try{
        if(s.length()==1){
            System.out.println(s);
        }
        String[] str=s.split("+");
        int[] num=new int[str.length];; 
        for(int i=0;i<str.length;i++){
            num[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        for
        }catch(Exception e){}
    }
}
