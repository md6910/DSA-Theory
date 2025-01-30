public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    Node head;
public void addfirst(int data){
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
    }
    else{
 newNode.next=head;
 head=newNode;


    }
}

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node CurrentNode = head;
            while (CurrentNode.next != null) {
                CurrentNode = CurrentNode.next;
            }
            CurrentNode.next = newNode;
        }
    }
    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("List is empty now");

        } else {
            Node CurrentNode = head;
            while (CurrentNode.next.next != null) {
                CurrentNode = CurrentNode.next;
            }
            CurrentNode.next = null;
        }
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else{
            Node Currentnode=head;
            Currentnode=null;
            head=head.next;

        }

    }
    public void displaylist() {

        if (head==null) {
            System.out.println("List is empty");
        }
        else {
            Node CurrentNode = head;
            while (CurrentNode!= null) {
                System.out.print("-->" + CurrentNode.data);
                CurrentNode = CurrentNode.next;
            }
            System.out.println("");
        }
    }

public boolean searchlist(int data){
        Node CurrentNode=head;

        while (CurrentNode!=null){
if (CurrentNode.data==data){
    System.out.println( data + " exists in the List");
return true;
}
CurrentNode=CurrentNode.next;
        }
    System.out.println(data+" does not exist in the list");
        return false;
}

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);

        list.searchlist(6);
        list.searchlist(5);
        list.displaylist();

        list.deletelast();
        list.displaylist();

        list.deletefirst();
        list.displaylist();

    }
}

