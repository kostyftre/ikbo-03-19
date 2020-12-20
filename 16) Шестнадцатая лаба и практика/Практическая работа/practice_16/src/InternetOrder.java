
class InternetOrder implements Order{
    int size=0;
    Customer customer;
    ListNode tail, head;

    public boolean addItem(MenuItem it){
        try{
            if (size==0){
                tail = new ListNode();
                tail.value = it;
                head = tail;
            }
            else{
                ListNode node = new ListNode();
                node.value = it;
                head.next = node;
                head = head.next;
            }
            size++;
            return true;
        }
        catch (Exception exc){
            return false;
        }
    }
    public String[] itemsNames(){
        String[] buff = new String[size];
        ListNode t = tail;
        for (int i = 0; i < size; i++) {
            buff[i] = t.value.getName();
            t = t.next;
        }
        return buff;
    }
    public int itemsQuantity(){
        return size;
    }
    public int itemsQuantity(String itemName){
        int cnt=0;
        for (ListNode t=tail; t!=null; t=t.next){
            if (t.value.getName().equals(itemName)){
                cnt++;
            }
        }
        return cnt;
    }
    public int itemsQuantity(MenuItem itemName){
        int cnt=0;
        for (ListNode t=tail; t!=null; t=t.next){
            if (t.value.equals(itemName)){
                cnt++;
            }
        }
        return cnt;
    }
    public MenuItem[] getItems(){
        MenuItem[] buff = new MenuItem[size];
        ListNode t = tail;
        for (int i = 0; i < size; i++) {
            buff[i] = t.value;
            t = t.next;
        }
        return buff;
    }
    public boolean remove(String itemName){
        if (size!=0){
            ListNode t;
            ListNode m;
            boolean removed = false;
            for (t = tail;t!=null && t!=head;t = t.next){
                if (t.next.value.getName().equals(itemName)){
                    m = t.next;
                    t.next = m.next;
                    m.next = null;
                    size--;
                    removed = true;
                }
            }
            if (t!=null){
                head = t;
            }
            if (tail.value.getName().equals(itemName) && !removed){ // Мы не учли первый элемент
                m = tail;
                tail = tail.next;
                m.next = null;
                size--;
            }
        }
        else{
            return false;
        }
        return true;
    }
    public boolean removeAll(String itemName){
        if (size!=0){
            ListNode t;
            ListNode m;
            for (t = tail;t!=null && t!=head;t = t.next){
                if (t.next.value.getName().equals(itemName)){
                    m = t.next;
                    t.next = m.next;
                    m.next = null;
                    size--;
                }
            }
            if (t!=null){
                head = t;
            }
            if (tail.value.getName().equals(itemName)){ // Мы не учли первый элемент
                m = tail;
                tail = tail.next;
                m.next = null;
                size--;
            }
        }
        else{
            return false;
        }
        return true;
    }
    public boolean remove(MenuItem item){
        if (size!=0){
            ListNode t;
            ListNode m;
            boolean removed = false;
            for (t = tail;t!=null && t!=head;t = t.next){
                if (t.next.value.equals(item)){
                    m = t.next;
                    t.next = m.next;
                    m.next = null;
                    size--;
                    removed = true;
                }
            }
            if (t!=null){
                head = t;
            }
            if (tail.value.equals(item) && !removed){ // Мы не учли первый элемент
                m = tail;
                tail = tail.next;
                m.next = null;
                size--;
            }
        }
        else{
            return false;
        }
        return true;
    }
    public boolean removeAll(MenuItem item){
        if (size!=0){
            ListNode t;
            ListNode m;
            for (t = tail;t!=null && t!=head;t = t.next){
                if (t.next.value.equals(item)){
                    m = t.next;
                    t.next = m.next;
                    m.next = null;
                    size--;
                }
            }
            if (t!=null){
                head = t;
            }
            if (tail.value.equals(item)){ // Мы не учли первый элемент
                m = tail;
                tail = tail.next;
                m.next = null;
                size--;
            }
        }
        else{
            return false;
        }
        return true;
    }
    public MenuItem[] sortedItemsByCostDesc(){
        return QuickSort(getItems(), 0, size-1);
    }
    public int costTotal(){
        int total = 0;
        for (ListNode t=tail;t!=null;t=t.next){
            total += t.value.getCost();
        }
        return total;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    @Override
    public String toString() {
        StringBuilder maker = new StringBuilder();
        for (MenuItem i: getItems()){
            maker.append("<br>").append(i.toString());
        }
        return "TableOrder{" + maker.toString() + "}";
    }
}
