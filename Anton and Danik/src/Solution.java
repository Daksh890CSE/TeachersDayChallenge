import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        kb.nextLine();
        String s=kb.nextLine();
        kb.close();
        int countA=0;
        int countD=0;
        for(int i=0;i<n;i++){
            switch(s.charAt(i)){
                case 'A':
                countA++;
                break;

                case 'D':
                countD++;
                break;

                default:
                break;
            }
        }if(countA>countD){
            System.out.println("Anton");
        }else if(countA==countD){
            System.out.println("Friendship");
        }else{
            System.out.println("Danik");
        }
    }
}
