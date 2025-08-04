import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb =new Scanner(System.in);
        String s=kb.next();
        String regex="[aeiouyAEIOUY]";
        s=s.toLowerCase();
        s=s.replaceAll(regex,"");
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length()*2;i++){
            if(i==0 || i%2==0){
                sb.insert(i,'.');
            }
        }
        s=sb.toString();
        System.out.println(s);
        kb.close();
    }

}
