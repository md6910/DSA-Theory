public class StackwithLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }


    }
    private Node head;

    public StackwithLinkedList(){
        head=null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        System.out.println(data+ " is pushed into the stack");
    }

    public int pop(){
        if(head==null){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int poppedelement=head.data;
            head=head.next;
            return poppedelement;
        }
    }

    public int peek(){
        if(head==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return head.data;
        }
    }

    public boolean isEmpty(){
        return (head==null);
    }

    public static void main(String[] args) {
        StackwithLinkedList list=new StackwithLinkedList();

        list.push(20);
        list.push(30);
        list.push(40);

        System.out.println("Popped Element: "+list.pop());
        System.out.println("Popped Element: "+list.pop());
        System.out.println("Popped Element: "+list.pop());
        System.out.println("Top Element: "+list.peek());
        System.out.println("Is Stack Empty: "+list.isEmpty());
    }
}
