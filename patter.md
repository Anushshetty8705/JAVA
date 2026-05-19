# 1. Butterfly Pattern

```java
int rows = 4;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= i; j++)
        System.out.print("*");

    for (int j = 1; j <= 2 * (rows - i); j++)
        System.out.print(" ");

    for (int j = i; j > 0; j--)
        System.out.print("*");

    System.out.println();
}

for (int i = rows; i > 0; i--) {

    for (int j = 1; j <= i; j++)
        System.out.print("*");

    for (int j = 1; j <= 2 * (rows - i); j++)
        System.out.print(" ");

    for (int j = i; j > 0; j--)
        System.out.print("*");

    System.out.println();
}
```

### Output

```text
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
```

---

# 2. Palindromic Number Pyramid

```java
int rows = 4;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }

    for (int j = i; j > 0; j--) {
        System.out.print(j);
    }

    for (int j = 2; j <= i; j++) {
        System.out.print(j);
    }

    System.out.println();
}
```

### Output

```text
   1
  212
 32123
4321234
```

---

# 3. Diamond Pattern

```java
int rows = 4;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }

    System.out.println();
}

for (int i = rows; i > 0; i--) {

    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

### Output

```text
   *
  ***
 *****
*******
*******
 *****
  ***
   *
```