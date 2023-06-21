class StockSpanner {
    Stack<Integer> stack;
    int index;
    ArrayList<Integer> list = new ArrayList<>();
    public StockSpanner() {
        stack = new Stack<>();
        index = 0;
    }
    
    public int next(int price) {
        if(index == 0)
        {
            list.add(price);
            stack.push(index);
            index++;
            return index;
        }
        else{
            while(!stack.isEmpty() && list.get(stack.peek())<=price)
            {
                stack.pop();
            }
            int result = 0;
            if(stack.size() == 0)result = 1+index;
            else result = index-stack.peek();
            stack.push(index);
            list.add(price);
            index++;
            return result;
            
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */