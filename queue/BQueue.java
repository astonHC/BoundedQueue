// COPYRIGHT (C) HARRY CLARK 2024
// CS2_DSA BOUNDED QUEUE IMPLEMENTATION

// THE FOLLOWING FILE AIMS TO ACT AS A CONSTRUCTOR FOR ANY AND ALL SUBSEQUENT
// METHODS PERTAINING TOWARDS A BOUNDED QUEUE

package queue;

public interface BQueue<T>
{
    boolean ADD(T VAR);

    void PUT(T VAR);

    T REMOVE();

    T POLL();
    
    T PEEK();

    boolean CONTAINS(T TYPE);

    boolean IS_OOB(T VAR);
}
