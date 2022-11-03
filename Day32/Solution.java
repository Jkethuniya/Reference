import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> calciStack = new Stack<>();
        for(String op: operations){
            if(op.equals("C")){
                calciStack.pop();
            }else if(op.equals("D")){
                //peek element doubled
                calciStack.push(calciStack.peek() * 2);
            }else if(op.equals("+")){
                int plusPoint = calciStack.pop() + calciStack.peek();
                calciStack.push(plusPoint-calciStack.peek());
                calciStack.push(plusPoint);
            }else{
                calciStack.push(Integer.parseInt(op));
            }
        }
        while(!calciStack.empty()){
            sum+=calciStack.pop();
        }
        return sum;
    }
}
