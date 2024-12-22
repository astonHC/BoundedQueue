// COPYRIGHT (C) HARRY CLARK 2024
// CS2_DSA BOUNDED QUEUE IMPLEMENTATION

// THE FOLLOWING FILE AIMS TO ACT AS A CONSTRUCTOR FOR ANY AND ALL SUBSEQUENT
// METHODS PERTAINING TOWARDS A BOUNDED QUEUE

package queue;

import java.util.LinkedList;

public class BQueueFactory<T> implements BQueue<T> 
{
    private final LinkedList<T> QUEUE = new LinkedList<>();
    private int BOUNDARY = 10;

    public BQueueFactory(int CAP) 
    {
        this.BOUNDARY = CAP;
    }

    @Override
    public boolean ADD(T VAR)
    {
        return QUEUE.add(VAR);
    }

    @Override
    public void PUT(T VAR) 
    {
        if (QUEUE.size() < BOUNDARY) 
        {
            QUEUE.add(VAR);
        } 
        else 
        {
            throw new IllegalStateException("Queue is full");
        }
    }

    @Override
    public T REMOVE()
    {
        return QUEUE.remove();
    }

    @Override
    public T POLL()
    {
        return QUEUE.poll();
    }

    @Override
    public T PEEK()
    {
        return QUEUE.peek();
    }

    @Override
    public boolean CONTAINS(T TYPE)
    {
        return QUEUE.contains(TYPE);
    }

    @Override
    public boolean IS_OOB(T VAR)
    {
        if((int)VAR > BOUNDARY)
        {
            System.out.println("Boundary exceeded");
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() 
    {
        return QUEUE.toString();
    }
}
