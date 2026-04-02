public class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;

        int[] s = new int[n + 1];
        s[0] = 1;
        s[1] = 2;
        s[2] = 2;

        int i = 2;        
        int num = 1;      
        int index = 3;    
        int countOnes = 1; 

        while (index < n) {
            int freq = s[i];  

            for (int j = 0; j < freq && index < n; j++) {
                s[index] = num;
                if (num == 1) countOnes++;
                index++;
            }

            num = (num == 1) ? 2 : 1; 
            i++;
        }

        return countOnes;
    }
}