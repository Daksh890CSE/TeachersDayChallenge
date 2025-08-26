import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s1=kb.nextLine();
        String s2=kb.nextLine();
        kb.close();
        String s3="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==0 && s2.charAt(i)==1 || s1.charAt(i)==1 && s2.charAt(i)==0){
                s3+=1;
            }else{
                s3+=0;
            }
        }System.out.println(s3);
    }
}
