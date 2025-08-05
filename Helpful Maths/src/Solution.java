import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        StringBuilder sb=new StringBuilder();
        String[] str=s.split("\\+");
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
            if(i<str.length-1){
                sb.append("+");
            }
        }
        String result=sb.toString();
        System.out.println(result);
        kb.close();
    }
}
