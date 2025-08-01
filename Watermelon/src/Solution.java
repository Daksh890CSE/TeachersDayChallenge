import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int w=kb.nextInt();
        if(w%2==0 && w!=2){
            System.out.println("YES");
        }else if(w==2){
            System.out.println("NO");
        }else{
            System.out.println("NO");
        }
        kb.close();
    }
}
