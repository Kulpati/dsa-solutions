package Strings;


public class Custom_Sort {

class Solution {
    public String customSortString(String order, String s) {
        int map[] = new int[26];
        for (char ch : s.toCharArray()) {
            map[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < order.length()) {
            if (map[order.charAt(i) - 'a'] > 0) {
                sb.append(order.charAt(i));
                map[order.charAt(i) - 'a']--;
            }
            if (map[order.charAt(i) - 'a'] == 0) {
                i++;
            }
        }
        int j = 0;
        while (j < 26) {
            if (map[j] > 0) {
                sb.append((char) (j + 'a'));
                map[j]--;
            }
            if (map[j] == 0) {
                j++;
            }
        }
        return sb.toString();
    }
}
}