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