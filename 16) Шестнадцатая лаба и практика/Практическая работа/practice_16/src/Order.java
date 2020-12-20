
import java.util.Scanner;

interface Order{

    boolean addItem(MenuItem it);
    String[] itemsNames();
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem itemName);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean removeAll(String itemName);
    boolean remove(MenuItem item);
    boolean removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    default MenuItem[] QuickSort(MenuItem[] arr, int left, int right){
        MenuItem mid = arr[(int)((left+right)/2.0)];
        int l = left;
        int r = right;
        MenuItem t;
        while(l<=r){
            while(arr[l].getCost() > mid.getCost()){
                l++;
            }
            while(arr[r].getCost()> mid.getCost()){
                r--;
            }
            if (l<=r){
                t = arr[r];
                arr[r] = arr[l];
                arr[l] = t;
                l++;
                r--;
            }
        }
        if (left<r){
            arr = QuickSort(arr, left, ++r);
        }
        if (l<right){
            arr = QuickSort(arr, --l, right);
        }
        return arr;
    }
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
