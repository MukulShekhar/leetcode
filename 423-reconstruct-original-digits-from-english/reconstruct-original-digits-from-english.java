class Solution {
    public String originalDigits(String s) {
        int [] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        int [] digits = new int[10];
        digits[0] = freq['z'-'a'];
        digits[2] = freq['w'-'a'];
        digits[6] = freq['x'-'a'];
        digits[4] = freq['u'-'a'];
        digits[8] = freq['g'-'a'];
        digits[5] = freq['f'-'a'] - digits[4];
        digits[1] = freq['o'-'a']-digits[2]-digits[4]-digits[0];
        digits[3] = freq['t'-'a']-digits[2]-digits[8];
        digits[7] = freq['s'-'a']-digits[6];
        digits[9] = freq['i'-'a']-digits[5]-digits[6]-digits[8];
        
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i<10 ; i++){
            for(int j = 0 ; j<digits[i]; j++){
                res.append(i);
            }
        }
        return res.toString();
    }
}