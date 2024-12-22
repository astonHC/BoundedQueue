# BoundedQueue
A lightweight implementation of BoundedQueue as per a Case Study (CS2_DSA)

![image](https://github.com/user-attachments/assets/b44535fe-159e-4547-8536-fa870b56dd6d)


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
