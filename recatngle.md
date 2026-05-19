# 1. Solid Rectangle Pattern

```java
int rows = 4;
int cols = 5;

for (int row = 1; row <= rows; row++) {

    for (int col = 1; col <= cols; col++) {
        System.out.print("*");
    }

    System.out.println();
}
```

### Output

```text
*****
*****
*****
*****
```

---

# 2. Hollow Rectangle Pattern

```java
int rows = 4;
int cols = 5;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= cols; j++) {

        if (i == 1 || j == 1 || i == rows || j == cols)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

### Output

```text
*****
*   *
*   *
*****
```