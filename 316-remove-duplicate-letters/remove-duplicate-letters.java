class Solution {
    public String removeDuplicateLetters(String s) {
         Map<Character, Integer> freq = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.get(ch)-1);
            if (set.contains(ch)) continue; 

            while (!stack.isEmpty() && stack.peek() > ch && freq.get(stack.peek()) > 0) {
                set.remove(stack.pop()); 
            }

            stack.push(ch);
            set.add(ch); 
        }

        StringBuilder res = new StringBuilder();
        for (char ch : stack) {
            res.append(ch);
        }

        return res.toString();
    }
}