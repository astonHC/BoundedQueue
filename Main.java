// COPYRIGHT (C) HARRY CLARK 2024
// CS2_DSA BOUNDED QUEUE IMPLEMENTATION

import queue.*;

public class Main 
{
    private static BQueue<Integer> BOUNDED;
    public static int BOUNDARY = 10;

    static 
    {
        BOUNDED = new BQueueFactory<>(BOUNDARY); 
    }

    public static void main(String[] args) 
    {
        BOUNDED.ADD(1);
        BOUNDED.ADD(10);

        // THROW AN OOB IN CASE THE ELEMENT HAS EXCEEDED

        BOUNDED.ADD(11);

        System.out.println(BOUNDED);
    }
}
