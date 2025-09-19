# BoundedQueue
A lightweight implementation of BoundedQueue as per a Case Study (CS2_DSA)

## Example:

```java
// DEFINE A CONSTANT FOR THE BOUNDS IN QUESTION
public static final int BOUNDARY = 10;

public static void main(String[] args) 
{
    BOUNDED.ADD(1);
    BOUNDED.ADD(10);

    // THROW AN OOB IN CASE THE ELEMENT HAS EXCEEDED

    BOUNDED.ADD(11);

    System.out.println(BOUNDED);
}
```

## Output:

<img width="1033" height="212" alt="image" src="https://github.com/user-attachments/assets/ced9f9f9-dcc1-4b31-8026-1ff7e9746b9b" />


# Building:

```
git clone this repo

javac *.java
java Main
```
