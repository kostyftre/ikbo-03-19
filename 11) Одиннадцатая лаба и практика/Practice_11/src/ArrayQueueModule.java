
import java.util.ArrayList;

public class ArrayQueueModule {

        private ArrayList<Integer> array = new ArrayList<Integer>();

        public ArrayQueueModule()    {

        }

        public void add(int number)
        {
            array.add(number);
        }

        public String toString() {
            return "ArrayQueueModule: " + array;
        }

        public ArrayList <Integer> GetArray()
        {
            return array;
        }
}
