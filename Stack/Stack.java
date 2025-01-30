public class Stack {
    private int maxsize;
    private int top;
    private int[] stackarray;

    public Stack(int size){
this.maxsize=size;
this.stackarray=new int[maxsize];
this.top=-1;
    }
    public void push(int value){
        if(top==maxsize-1){
            System.out.println("Stack Overflow");
        return;
        }
        stackarray[++top]=value;
        System.out.println(value + " pushed into the stack");
    }


    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stackarray[top--];
        }
    }


        public int peek(){
        if (top==-1){
                System.out.println("Stack is Empty");
                return -1;
            }
        else{
            return stackarray[top];
        }
        }

        public boolean isEmpty(){
        return(top==-1);
        }

    public static void main(String[] args) {
        Stack stack=new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element: "+stack.peek());
        System.out.println("Popped Element: "+stack.pop());
        System.out.println("Pushed Element: "+stack.isEmpty());
    }





}
