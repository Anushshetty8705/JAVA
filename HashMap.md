# Custom HashMap in Java

## Node Class

```java
class node {
    k key;
    v val;

    node(k key, v val) {
        this.key = key;
        this.val = val;
    }
}
```

## Constructor

```java
@SuppressWarnings("unchecked")
hasmap() {
    this.N = 4;
    this.bucket = (LinkedList<node>[]) new LinkedList[N];

    for (int i = 0; i < N; i++) {
        bucket[i] = new LinkedList<>();
    }
}
```

## Hash Function

```java
public int hash(k key) {
    int bi = key.hashCode();
    return Math.abs(bi) % N;
}
```

## Search in LinkedList

```java
public int searchll(k key, int bi) {
    LinkedList<node> ll = bucket[bi];

    for (int i = 0; i < ll.size(); i++) {
        if (ll.get(i).key.equals(key)) {
            return i;
        }
    }

    return -1;
}
```

## Rehash

```java
@SuppressWarnings("unchecked")
public void rehash() {
    LinkedList<node>[] old = bucket;

    N = N * 2;
    bucket = (LinkedList<node>[]) new LinkedList[N];

    for (int i = 0; i < N; i++) {
        bucket[i] = new LinkedList<>();
    }

    n = 0;

    for (LinkedList<node> ll : old) {
        for (node ne : ll) {
            put(ne.key, ne.val);
        }
    }
}
```

## Put

```java
public void put(k key, v val) {
    int bi = hash(key);
    int di = searchll(key, bi);

    if (di == -1) {
        bucket[bi].add(new node(key, val));
        n++;
    } else {
        node cur = bucket[bi].get(di);
        cur.val = val;
    }

    if ((double) n / N >= 2.0) {
        rehash();
    }
}
```

## Get

```java
public v get(k key) {
    int bi = hash(key);
    int di = searchll(key, bi);

    if (di == -1) {
        return null;
    }

    return bucket[bi].get(di).val;
}
```

## Contains Key

```java
public boolean containskey(k key) {
    int bi = hash(key);
    int di = searchll(key, bi);

    return di != -1;
}
```

## Remove

```java
public v remove(k key) {
    int bi = hash(key);
    int di = searchll(key, bi);

    if (di == -1) {
        return null;
    }

    n--;
    return bucket[bi].remove(di).val;
}
```

## isEmpty

```java
public boolean isEmpty() {
    return n == 0;
}
```

## KeySet

```java
public ArrayList<k> keyset() {
    ArrayList<k> arr = new ArrayList<>();

    for (LinkedList<node> list : bucket) {
        for (node cur : list) {
            arr.add(cur.key);
        }
    }

    return arr;
}
```
