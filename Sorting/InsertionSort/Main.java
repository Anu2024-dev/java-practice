package Sorting.InsertionSort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={20,10,5,6,8,7};
        System.out.println("Before insertion sort: "+Arrays.toString(arr));
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("after insertion sort: "+Arrays.toString(arr));

    }
}
