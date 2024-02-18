package collectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> data = new LinkedList<>();
        data.offer(45);
        data.offer(12);
        data.offer(63);

        System.out.println(data);
        System.out.println("Head of queue"+data.peek());
        data.poll();
        System.out.println("Head of queue"+data.peek());

        data.poll();
        System.out.println("Head of queue"+data.peek());
        data.poll();
        // System.out.println(data.element());//exception will occur because no element is present inside queue to return thats why
        data.remove();//exception will occur because no element is present inside queue to remove thats why


    }
}
