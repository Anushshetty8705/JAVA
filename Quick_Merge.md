# 1 QUICK SORT
```java
public static void QuicSort(int[] arr,int low,int high){
   if(low < high){
    int i =partion(arr,low,high);
    QuicSort(arr,low,i-1);
    QuicSort(arr,i+1,high);
   }
    }
public static int partion(int[] arr,int low,int high){
    int i = low-1,pivot =arr[high];
    for(int j=low;j<arr.length;j++){
        if(arr[j] < pivot){
            i++;
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp =arr[i];
    arr[i] =pivot;
    arr[high] =temp;
    return i;
}
    public static void main(String[] args) {
        int arr[] =  {4,2,8,7,9,6,1};
QuicSort(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+ " ");
    }
```
### Time complexity
```text
worst case : n^2 only in sorted array 
avg cas:nlogn genrally this
```
# 2.MERGE SORT
```java
 public static void divide(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int m[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2])
                m[x++] = arr[idx1++];
            else
                m[x++] = arr[idx2++];
        }
        while (idx1 <= mid) {
            m[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            m[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < m.length; i++, j++) {
            arr[j] = m[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 7, 9, 6, 1 };
        divide(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
```
## Time complexity
```text
n log(n)
```