import java.util.LinkedList;

public class AbstractQueue
{
    private LinkedList<Integer> link;

    AbstractQueue()
    {
        link = new LinkedList<Integer>();
    }

    public int element()
    {
        return link.peek();
    }

    public int dequeue() {
        return link.poll();
    }
}
