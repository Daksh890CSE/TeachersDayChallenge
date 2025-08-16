import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int t = kb.nextInt();
        kb.nextLine();
        char[] ch = kb.nextLine().toCharArray();
        kb.close();
        for (int i = 0; i < t; i++) {
            for (int j = 1; j < n; j++) {
                if (ch[j - 1] == 'B' && ch[j] == 'G') {
                    ch[j - 1] = 'G';
                    ch[j] = 'B';
                    j++;
                }
            }
        }
        String s = new String(ch);
        System.out.println(s);
    }
}
