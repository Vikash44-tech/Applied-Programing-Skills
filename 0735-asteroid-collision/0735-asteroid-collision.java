class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -a) {
                    stack.pop();      // right-moving asteroid is smaller
                } 
                else if (top == -a) {
                    stack.pop();      // both destroy each other
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true; // left-moving asteroid is destroyed
                    break;
                }
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
