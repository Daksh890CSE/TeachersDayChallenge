import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);
        int total = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char character = s.charAt(i);
            if (i + 1 < len) {
                char nxtchar = s.charAt(i + 1);
                if (ht.get(character) < ht.get(nxtchar)) {
                    int val = ht.get(nxtchar) - ht.get(character);
                    total += val;
                } else {
                    int val = ht.get(character);
                    total += val;
                }
            } else {
                int val = ht.get(character);
                total += val;
            }
        }
        return total;
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a Roman numeral:");
        String s = kb.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.romanToInt(s));
        kb.close();
    }
}