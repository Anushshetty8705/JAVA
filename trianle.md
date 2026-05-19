# 1. Simple Triangle Pattern

```java
int rows = 4;

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Output

```text
*
**
***
****
```

---

# 2. Opposite Triangle Pattern

```java
int rows = 4;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

### Output

```text
   *
  **
 ***
****
```

---

# 3. Number Triangle Pattern

```java
int rows = 4;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }

    System.out.println();
}
```

### Output

```text
1
12
123
1234
```

---

# 4. Floyd's Triangle Pattern

```java
int rows = 4;
int number = 1;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
    }

    System.out.println();
}
```

### Output

```text
1
2 3
4 5 6
7 8 9 10
```

---

# 5. 0-1 Triangle Pattern

```java
int rows = 4;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= i; j++) {

        if ((i + j) % 2 == 0)
            System.out.print("1 ");
        else
            System.out.print("0 ");
    }

    System.out.println();
}
```

### Output

```text
1
0 1
1 0 1
0 1 0 1
```