import java.util.ArrayList;

public class ArrayQueue {

    private ArrayList<Integer> array;

    ArrayQueue(ArrayList<Integer> array) {
        this.array = array;
    }

    public boolean enqueue(Integer n) //Добавление
    {
        return array.add(n);
    }

    public Integer element() //Первый эл
    {
        return array.get(0);
    }

    public Integer dequeue() //Удалить и вывести
    {
        int temp = array.get(0);
        array.remove(0);
        return temp;
    }

    public int size() //Размер
    {
        return array.size();
    }

    public boolean isEmpty()//Путсота
    {
        return array.isEmpty();
    }

    public void clear()//Удаление
    {
        array.clear();
    }
}