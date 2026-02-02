class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[s.length()];

        // Step 1: Identify invalid parentheses
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    remove[i] = true; // extra ')'
                } else {
                    stack.pop();
                }
            }
        }

        // Step 2: Mark remaining '(' as invalid
        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        // Step 3: Build result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
