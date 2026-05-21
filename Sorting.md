# Bubble Sort

```java
int[] arr = {5, 4, 3, 2, 1};

for (int i = 0; i < arr.length - 1; i++) {

    for (int j = 0; j < arr.length - i - 1; j++) {

        if (arr[j] > arr[j + 1]) {

            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}

for (int num : arr) {
    System.out.print(num + " ");
}
```

### Output

```text
1 2 3 4 5
```

---

# Selection Sort

```java
int[] arr = {5, 4, 3, 2, 1};

for (int i = 0; i < arr.length - 1; i++) {

    int smallest = i;

    for (int j = i + 1; j < arr.length; j++) {

        if (arr[j] < arr[smallest]) {
            smallest = j;
        }
    }

    int temp = arr[smallest];
    arr[smallest] = arr[i];
    arr[i] = temp;
}

for (int num : arr) {
    System.out.print(num + " ");
}
```

### Output

```text
1 2 3 4 5
```

---

# Insertion Sort

```java
int[] arr = {5, 4, 3, 2, 1};

for (int i = 1; i < arr.length; i++) {

    int current = arr[i];
    int j = i - 1;

    while (j >= 0 && arr[j] > current) {

        arr[j + 1] = arr[j];
        j--;
    }

    arr[j + 1] = current;
}

for (int num : arr) {
    System.out.print(num + " ");
}
```

### Output

```text
1 2 3 4 5
```