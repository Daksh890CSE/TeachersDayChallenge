import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter weight of watermelon: ");
        int w=kb.nextInt();
        if(w%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        kb.close();
    }
}
