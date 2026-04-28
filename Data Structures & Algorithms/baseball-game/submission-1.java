class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String operation=operations[i];
            if (operation.equals("D")) {
                int lastRecord = stack.peek();
                stack.push(lastRecord * 2);
                sum+=lastRecord*2;
            } else if (operation.equals("C")) {
                int record=stack.pop();
                sum -= record;
            } else if (operation.equals("+")) {
                int lastRecord = stack.pop();
                int newRecord = stack.peek()+lastRecord;
                stack.push(lastRecord);
                stack.push(newRecord);
                sum+=newRecord;
            } else {
                int score = Integer.parseInt(operation);
                stack.push(score);
                sum+=score;
            }
        }
        return sum;
    }
}