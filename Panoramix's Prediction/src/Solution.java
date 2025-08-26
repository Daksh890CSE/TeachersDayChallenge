import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        kb.close();
        boolean[] bool = new boolean[50];
        ArrayList<Integer> prime=new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            bool[i] = true;
        }
        for (int i = 2; i < Math.sqrt(50); i++) {
            if (bool[i] == true) {
                for (int j = i * i; j < 50; j += i) {
                    bool[j] = false;
                }
            }
        }
        for (int i = 2; i < 50; i++) {
            if (bool[i] == true) {
                prime.add(i);
            }
        }
        int indexn=prime.indexOf(n);
        if(prime.get(indexn+1)==m){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
