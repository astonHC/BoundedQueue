// COPYRIGHT (C) HARRY CLARK 2024
// CS2_DSA BOUNDED QUEUE IMPLEMENTATION

// THE FOLLOWING FILE AIMS TO ACT AS A CONSTRUCTOR FOR ANY AND ALL SUBSEQUENT
// METHODS PERTAINING TOWARDS A BOUNDED QUEUE

package queue;

import java.util.LinkedList;

public class BQueueFactory<T> implements BQueue<T> 
{
    private final LinkedList<T> QUEUE = new LinkedList<>();
    private final int CAPACITY;

    public BQueueFactory(int CAP) 
    {
        this.CAPACITY = CAP;
    }

    // ADD'S A CORRESPONDING ELEMENT TO THE BACK OF THE QUEUE
    // CHECKS FOR BOUNDARYS BASED ON A PRE-DEFINED NUMBER OF ELEMENTS
    // RETURNS: A BOOLEAN TYPE WHICH IS EXPRESSED BY THE ACCESS METHOD
    // OF ADD FROM THE QUEUE 

    @Override
    public boolean ADD(T VAR)
    {
        if(IS_OOB(VAR))
        {
            System.err.println("BOUNDARY EXCEEDED BY VALUE(S): " + VAR);
            return false;
        }

        return QUEUE.add(VAR);
    }

    // PUT A VALUE IN PLACE AT THE BACK OF THE QUEUE
    // IF THE QUEUE IS FULL

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

    // REMOVES A CORRESPONDING ELEMENT FROM THE FRONT OF THE QUUEUE
    // RETURNS: THE ACCESS METHOD OF REMOVE FROM THE QUEUE

    @Override
    public T REMOVE()
    {
        return QUEUE.remove();
    }

    // RETRIEVES AND REMOVES THE HEAD OF THE QUEUE
    // RETURNS THE HEAD OF THE QUEUE

    @Override
    public T POLL()
    {
        return QUEUE.poll();
    }

    // RETRIEVES BUT DOES NOT REMOVE THE HEAD OF THE QUEUE
    // RETURNS THE HEAD OF THE QUEUE

    @Override
    public T PEEK()
    {
        return QUEUE.peek();
    }

    // CHECKS IF THE QUEUE CONTAINS A SPECIFIC ELEMENT
    // RETURNS: TRUE IF THE QUEUE CONTAINS THE ELEMENT

    @Override
    public boolean CONTAINS(T TYPE)
    {
        return QUEUE.contains(TYPE);
    }

    // CHECKS IF THE GIVEN ELEMENT EXCEEDS THE BOUNDARY LIMIT OR IF THE QUEUE IS FULL
    // RETURNS: TRUE IF THE ELEMENT EXCEEDS BOUNDARY

    @Override
    public boolean IS_OOB(T VAR)
    {
        if (VAR instanceof Number && ((Number) VAR).intValue() > CAPACITY) { return true; }
        return QUEUE.size() >= CAPACITY;
    }

    @Override
    public String toString() 
    {
        return QUEUE.toString();
    }
}
