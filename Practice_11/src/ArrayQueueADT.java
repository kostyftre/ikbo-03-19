import java.util.ArrayList;

public class ArrayQueueADT {

    public boolean enqueue(ArrayList<Integer> array, Integer n) //Добавить
    {
        return array.add(n);
    }

    public Integer element(ArrayList<Integer> array) //Первый
    {
        return array.get(0);
    }

    public Integer dequeue(ArrayList<Integer> array)//Удалить и вернуть
    {
        int temp = array.get(0);
        array.remove(0);
        return temp;
    }

    public int size(ArrayList<Integer> array) //Размер
    {
        return array.size();
    }

    public boolean isEmpty(ArrayList<Integer> array)//Пустота
    {
        return array.isEmpty();
    }

    public void clear(ArrayList<Integer> array)//Удаление
    {
        array.clear();
    }
}