# Fibonacci Series Using Recursion

```java
public static void fib(int a, int b, int n) {

    if (n <= 0) {
        return;
    }

    int c = a + b;

    System.out.println(c);

    fib(b, c, n - 1);
}
```

### Function Call

```java
System.out.println(0);
System.out.println(1);

fib(0, 1, 5);
```

### Output

```text
0 1 1 2 3 5 8
```

---

# Tower of Hanoi Using Recursion

```java
public static void toh(int n, String src, String help, String dest) {

    if (n == 1) {
        System.out.println(n + " disk from " + src + " to " + dest);
        return;
    }

    toh(n - 1, src, dest, help);

    System.out.println(n + " disk from " + src + " to " + dest);

    toh(n - 1, help, src, dest);
}
```

### Function Call

```java
toh(3, "S", "H", "D");
```

### Output

```text
1 disk from S to D
2 disk from S to H
1 disk from D to H
3 disk from S to D
1 disk from H to S
2 disk from H to D
1 disk from S to D
```