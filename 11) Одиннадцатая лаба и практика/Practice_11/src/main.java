public class main {
    public static void main(String[] ar)
    {
        ArrayQueueModule arr_1 = new ArrayQueueModule();

       LinkedQueue arr_2 = new LinkedQueue(); //

        for (int i = 0; i < 10; i++)
        {
            arr_1.add(i);
            arr_2.enqueue(i); //
        }
        System.out.println(arr_1);
        System.out.println(arr_2); //

        ArrayQueue arr_3 = new ArrayQueue (arr_1.GetArray());

        ArrayQueueADT arr_4 = new ArrayQueueADT();
        System.out.println(arr_3.element());
        arr_2.dequeue(); //
        arr_3.enqueue (13);
        System.out.println(arr_3);
        arr_4.enqueue(arr_1.GetArray(), 15);
    }
}
