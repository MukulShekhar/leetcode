class Solution {
public int maxVowels(String s, int k) {
 int maxVow = 0, curVow = 0;
 for (int i = 0; i < s.length(); i++) {
            curVow += isVowel(s.charAt(i));
            if (i >= k) {
                curVow -= isVowel(s.charAt(i - k)); 
            }
            maxVow = Math.max(maxVow, curVow);
        }
        return maxVow;
    }
     public static int isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
}