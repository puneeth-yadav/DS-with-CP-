// stack implementation with help array

// principle

// LIFO

class Stack {
    int top;
    int[] arr;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public int append(int a) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
            return -1;
        }
        top++;
        arr[top] = a;
        return arr[top];
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int popped = arr[top];
        arr[top] = 0;
        top--;
        return popped;
    }
    
    public void currstateStack(){
        System.out.println("top is at "+ top);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        
        return;
        
    }
    public void travarsal(){
          if (top == -1) {
        System.out.println("Stack is empty");
        return;
    }

    System.out.println("Stack");
    for (int i=top; i>=0; i--) {
        System.out.println(arr[i]);
    }
            
        
    }
}

class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
         s.currstateStack();
        System.out.println(s.append(10));
        System.out.println("----After appending 10 -----");
        s.currstateStack();
        System.out.println(s.append(17));
        System.out.println("----After appending 17 -----");
        s.currstateStack();
         System.out.println(s.append(18));
        System.out.println("----After appending 18 -----");
        s.currstateStack(); 
        System.out.println(s.append(19));
        System.out.println("----After appending 19 -----");
        s.currstateStack(); 
        System.out.println(s.append(20));
        System.out.println("----After appending 20 -----");
        s.currstateStack();
        s.travarsal();
    }
}
