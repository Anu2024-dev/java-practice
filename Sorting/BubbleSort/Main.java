package Sorting.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,5,40,8,9,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.err.println("Bubble sorted Array is: "+Arrays.toString(arr));


    }
}
