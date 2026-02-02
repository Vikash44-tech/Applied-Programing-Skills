class StockSpanner {

    // Stack stores pairs: (price, span)
    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Pop all previous prices <= current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        // Push current price with its span
        stack.push(new int[]{price, span});

        return span;
    }
}
