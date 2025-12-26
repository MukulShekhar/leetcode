class Solution {
    public int bestClosingTime(String customers) {
        int bestTime = 0;
        int minPenalty = 0;
        int prefix = 0;

        for (int i = 0; i < customers.length(); i++) {
            char ch = customers.charAt(i);

            if (ch == 'Y') {
                prefix = prefix - 1;
            } else {
                prefix = prefix + 1;
            }

            if (prefix < minPenalty) {
                bestTime = i + 1;
                minPenalty = prefix;
            }
        }

        return bestTime;
    }
}
