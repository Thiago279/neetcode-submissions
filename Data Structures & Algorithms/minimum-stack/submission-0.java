class MinStack {
    //design whole stack
    //keep track of minimum element
    //how to retrieve minimum? auxiliary stack
    // main : 7 -> 5 ->3 -> 4
    //aux : 7 -> 5 -> 3 -> 3
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.mainStack = new Stack<>();
        this.minStack = new Stack<>();
        
    }
    
    public void push(int val) {
        mainStack.push(val);
        System.out.println("push main: " + val );
        if(minStack.isEmpty() || minStack.peek() > val){
            minStack.push(val);
            System.out.println("push min: " + val );
        }else{
            minStack.push(minStack.peek());
            System.out.println("push min: " + minStack.peek() );
        }
    }
    
    public void pop() {
        int val = mainStack.peek();
        int val2 = minStack.peek();
        mainStack.pop();
        System.out.println("pop main: " + val );
        minStack.pop();
        System.out.println("pop min: " + val2 );

    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        /*while(mainStack.peek() != minStack.peek()){
            mainStack.pop();
            minStack.pop();
        }
        minStack.pop();
        return mainStack.pop();*/
        return minStack.peek();
    }
}
