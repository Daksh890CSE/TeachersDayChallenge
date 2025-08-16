import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int t=kb.nextInt();
        kb.nextLine();
        String s=kb.nextLine();
        kb.close();
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)=='B' && s.charAt(i)=='G'){
                char ch=s.charAt(i-1);
                s=s.replace(s.charAt(i-1), s.charAt(i));
                s=s.replace(s.charAt(i),ch);

            }
        }System.out.println(s);
    }
}
