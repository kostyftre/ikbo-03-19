
import java.util.HashMap;

public class TableOrdersManager implements OrdersManager{
    HashMap<Integer, Order> table = new HashMap<>();
    final int tableCount = 20;

    static class IllegalTableNumber extends Throwable{

    }

    void add(int tableNumber, Order order) throws IllegalTableNumber{
        if (tableNumber<1 || tableNumber > tableCount){
            throw new IllegalTableNumber();
        }
        if (table.get(tableNumber) != null){
            throw new IllegalTableNumber();
        }
        table.put(tableNumber, order);
    }

    int freeTableNumber(){
        for (int i=1;i<=tableCount;i++){
            if (table.get(i)!=null){
                return i;
            }
        }
        return -1;
    }

    int[] freeTableNumbers(){
        int cnt = 0;
        for (int i=1;i<=tableCount;i++){
            if (table.get(i)!=null){
                cnt++;
            }
        }
        int[] arr = new int[cnt];
        for (int i=0;i<tableCount;i++){
            if (table.get(i)!=null){
                arr[--cnt] = i;
            }
        }
        return arr;
    }

    Order getOrder(int tableNumber){
        return table.get(tableNumber);
    }

    void remove(int tableNumber){
        table.remove(tableNumber);
    }
    /** возвращает номер удалённого столика, или 0, если он не найден */
    int remove(Order order){
        for (int i : table.keySet()){
            if (table.get(i).equals(order)){
                table.remove(i);
                return i;
            }
        }
        return -1;
    }
    /** возвращает количество удалённых элементов */
    int removeAll(Order order){
        int cnt=0;
        for (int i : table.keySet()){
            if (table.get(i).equals(order)){
                table.remove(i);
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int cnt=0;
        for (int i : table.keySet()){
            cnt+= table.get(i).itemsQuantity(itemName);
        }
        return cnt;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int cnt=0;
        for (int i : table.keySet()){
            cnt+= table.get(i).itemsQuantity(item);
        }
        return cnt;
    }

    @Override
    public Order[] getOrders() {
        int cnt=table.keySet().size();
        Order[] arr = new Order[cnt];
        for (int i : table.keySet()){
            arr[--cnt] = table.get(i);
        }
        return arr;
    }

    @Override
    public int ordersCostSummary() {
        int sum=0;
        for (int i : table.keySet()){
            sum += table.get(i).costTotal();
        }
        return sum;
    }

    @Override
    public int ordersQuantity() {
        return table.keySet().size();
    }

    @Override
    public String toString() {
        StringBuilder maker = new StringBuilder();
        for (Order ord: getOrders()){
            maker.append("<br>").append(ord.toString());
        }
        return "<html>TableOrdersManager{orders: " + maker.toString() + "}</html>";
    }
}