

public class TableOrder implements Order {
    int size=0;
    final int MAXSIZE;
    MenuItem[] items;
    Customer customer;

    TableOrder(int size) {
        this.MAXSIZE = size;
        items = new MenuItem[MAXSIZE];
    }

    public boolean addItem(MenuItem it) {
        if (size<MAXSIZE){
            items[size] = it;
            return true;
        }
        else{
            return false;
        }
    }

    public String[] itemsNames() {
        String[] arr = new String[size+1];
        for (int i=0;i<=size;i++){
            arr[i] = items[i].getName();
        }
        return arr;
    }

    public int itemsQuantity() {
        return size;
    }

    public int itemsQuantity(String itemName) {
        int cnt = 0;
        for (int i=0;i<=size;i++){
            if (items[i].getName().equals(itemName)){
                cnt++;
            }
        }
        return cnt;
    }

    public int itemsQuantity(MenuItem itemName) {
        int cnt = 0;
        for (int i=0;i<=size;i++){
            if (items[i].equals(itemName)){
                cnt++;
            }
        }
        return cnt;
    }

    public MenuItem[] getItems() {
        MenuItem[] arr = new MenuItem[size+1];
        for (int i=0;i<=size;i++){
            arr[i] = items[i];
        }
        return arr;
    }

    public boolean remove(String itemName) {
        int offset = 0;
        for (int i=0;i<=size;i++){
            if (items[i].getName().equals(itemName) && offset!=1){
                offset++;
            }
            if (i+offset>size){
                items[i] = null;
                break;
            }
            items[i] = items[i+offset];
        }
        size -= offset;
        return true;
    }

    public boolean removeAll(String itemName) {
        int offset = 0;
        for (int i=0;i<=size;i++){
            if (items[i].getName().equals(itemName)){
                offset++;
            }
            if (i+offset>size){
                items[i] = null;
                break;
            }
            items[i] = items[i+offset];
        }
        size -= offset;
        return true;
    }

    public boolean remove(MenuItem item) {
        int offset = 0;
        for (int i=0;i<=size;i++){
            if (items[i].equals(item) && offset!=1){
                offset++;
            }
            if (i+offset>size){
                items[i] = null;
                break;
            }
            items[i] = items[i+offset];
        }
        size -= offset;
        return true;
    }

    public boolean removeAll(MenuItem item) {
        int offset = 0;
        for (int i=0;i<=size;i++){
            if (items[i].equals(item)){
                offset++;
            }
            if (i+offset>size){
                items[i] = null;
                break;
            }
            items[i] = items[i+offset];
        }
        size -= offset;
        return true;
    }

    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] arr = new MenuItem[size+1];
        return QuickSort(arr, 0, size);
    }
    public int costTotal() {
        int sum = 0;
        for (int i=0;i<=size;i++){
            sum += items[i].getCost();
        }
        return sum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        StringBuilder maker = new StringBuilder();
        for (MenuItem i: items){
            maker.append("<br>").append(i.toString());
        }
        return "TableOrder{" + maker.toString() + "}";
    }
}
