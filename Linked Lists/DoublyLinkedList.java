

public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;

        }
    }

    Node head;
    Node tail;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail=newNode;
        } else {
tail.next=newNode;
newNode.prev=tail;
tail=newNode;
        }
    }

    public void deletelast() {
        if (head.next == null) {
            head = null;
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;

        }
    }

    public void deletefirst() {
        if (head.next == null) {
            head = null;
            System.out.println("List is empty");
        }  else if (head == tail) {
        head = null;
        tail = null;
    } else {
            head=head.next;
            head.prev=null;
        }
    }

    public void displaylistfwd() {
        if (head == null) {
            System.out.print("List is empty");
        } else {
            Node Currentnode = head;
            while (Currentnode != null) {
                System.out.print("-->" + Currentnode.data);
                Currentnode = Currentnode.next;
            }
        }
            System.out.println();
        }

    public void displaylistbwd(){
        if (head==null){
            System.out.print("List is empty");
        }
        else {
            Node Currentnode = tail;
            while (Currentnode != null) {
                System.out.print("-->" + Currentnode.data);
                Currentnode = Currentnode.prev;
            }
            System.out.println();
        }
    }

    public boolean searchlist(int data){
        Node CurrentNode=tail;
while (CurrentNode.prev!=null){
    if (data==CurrentNode.data){
        System.out.println(data +" exists in the list");
        return true;
    }
    CurrentNode=CurrentNode.prev;
}
        System.out.println(data + " does not exist in the list");
   return false;
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        list.displaylistfwd();
        list.displaylistbwd();

        list.searchlist(7);
        list.searchlist(6);

        list.deletefirst();
        list.displaylistfwd();

        list.deletelast();
        list.displaylistbwd();
    }
}


