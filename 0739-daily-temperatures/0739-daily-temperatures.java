class Solution {
    public int[] dailyTemperatures(int[] temp) {
        // maintain a stack of indices
        Stack<Integer> stack = new Stack<>();
        
        int output[] = new int[temp.length];
        // for the last day there will be no warmer day
        stack.push(temp.length-1);
        output[temp.length-1] = 0;
        for(int i =temp.length-2;i>=0;i--)
        {
            if(stack.isEmpty() || temp[i]<temp[stack.peek()])
                output[i] = 1;
            else{
                while(!stack.isEmpty() && temp[stack.peek()]<=temp[i])
                    stack.pop();
                if(stack.size() == 0) output[i] = 0;
                else
                    output[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        return output;
    }
}