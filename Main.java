// COPYRIGHT (C) HARRY CLARK 2024
// CS2_DSA BOUNDED QUEUE IMPLEMENTATION

import queue.*;

public class Main 
{
    public static BQueue<Integer> BOUNDED;

    static
    {
        BOUNDED = new BQueueFactory<>(BQueue.BOUNDARY);
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
