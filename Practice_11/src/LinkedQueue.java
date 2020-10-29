import java.util.LinkedList;

public class LinkedQueue
{
    private LinkedList <Integer> link;

    LinkedQueue()
    {

        link = new LinkedList<Integer>();
    }

    public boolean enqueue(int n)
    {
        return link.offer(n);
    }

    public int element()
    {
        return link.peek();
    }

    public int dequeue()
    {
        return link.poll();
    }

    public int size()
    {
        return link.size();
    }

    public boolean isEmpty(int n)
    {
        return link.isEmpty();
    }

    public void clear()
    {
        link.clear();
    }


}