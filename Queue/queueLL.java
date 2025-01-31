
import java.util.Queue;
import java.util.LinkedList;

public class queueLL {
    public static void main(String[] args) {

        Queue<Integer> example=new LinkedList<>();
        example.add(10);
        example.add(20);
        example.add(30);

        System.out.println(""+example );
        System.out.println(""+example.poll());
        System.out.println("Queue after removal: "+example);
    }
}
