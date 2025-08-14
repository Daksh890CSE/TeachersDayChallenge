import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int x=0;
        int n=kb.nextInt();
        kb.nextLine();
        for(int i=0;n<i;i++){
            String s=kb.nextLine();
            switch(s){
                case "++x":
                ++x;
                break;

                case "x++":
                x++;
                break;

                case "--x":
                --x;
                break;

                case "x--":
                x--;
                break;

                default:
                break;
            }
        }
    }
}
