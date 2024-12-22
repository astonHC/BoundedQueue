# BoundedQueue
A lightweight implementation of BoundedQueue as per a Case Study (CS2_DSA)

![image](https://github.com/user-attachments/assets/c23efeed-2d74-44d3-9e40-e61331a9ed7e)

## Example:

```java
public static void main(String[] args) 
{
  BOUNDED.ADD(1);
  BOUNDED.ADD(10);

  // THROW AN OOB IN CASE THE ELEMENT HAS EXCEEDED

  BOUNDED.IS_OOB(11);

  System.out.println(BOUNDED);
}
```

# Building:

```
git clone this repo

javac *.java
java Main
```
