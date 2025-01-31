
import java.util.Queue;
import java.util.ArrayDeque;
public class queue{
    public static void main(String[] args) {
        Queue<Integer> array=new ArrayDeque<>();

        array.add(10);
        array.add(20);
        array.add(30);

        System.out.println(""+array);
        System.out.println(""+array.poll());
        System.out.println("Queue after Changed"+array);
    }
}