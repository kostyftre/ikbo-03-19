


class InternetOrdersManager implements OrdersManager {
    QueueNode head = new QueueNode();

    InternetOrdersManager() {
        head.next = head;
    }

    int size;

    boolean add(Order order) {
        QueueNode q = new QueueNode();
        q.value = order;
        q.prev = head;
        q.next = head.next;
        head.next = q;
        size++;
        return true;
    }

    Order remove() {
        if (size > 0) {
            QueueNode todel = head.prev;
            todel.prev.next = todel.next;
            todel.next.prev = todel.prev;
            size--;
            return todel.value;
        }
        return null;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int cnt = 0;
        for (QueueNode q = head.next; q != head; q = q.next) {
            cnt += q.value.itemsQuantity(itemName);
        }
        return cnt;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int cnt = 0;
        for (QueueNode q = head.next; q != head; q = q.next) {
            cnt += q.value.itemsQuantity(item);
        }
        return cnt;
    }

    @Override
    public Order[] getOrders() {
        Order[] arr = new Order[size];
        int offset = 0;
        for (QueueNode q = head.next; q != head; q = q.next) {
            arr[offset] = q.value;
            offset++;
        }
        return arr;
    }

    @Override
    public int ordersCostSummary() {
        int sum = 0;
        for (QueueNode q = head.next; q != head; q = q.next) {
            sum += q.value.costTotal();
        }
        return sum;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder maker = new StringBuilder();
        for (Order ord: getOrders()){
            maker.append("<br>").append(ord.toString());
        }
        return "<html>InternetOrdersManager{orders: " + maker.toString() + "}</html>";
    }
}