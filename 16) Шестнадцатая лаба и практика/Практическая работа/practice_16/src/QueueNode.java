

class QueueNode{
    Order value;
    QueueNode prev, next;

    @Override
    public String toString() {
        return "QueueNode{" +
                "value=" + value +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
