package Sorting.MergeSort;

import java.util.Arrays;

public class Main {
    public static void mergeSort(int[] arr, int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            combine(arr,start,mid,end);
        }

    }
    private static void combine(int[] arr,int start,int mid,int end){
        int totalLength=end-start+1;
        int[] c=new int[totalLength];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                c[k]=arr[i];
                i++;
                 k++;
            }else{
                c[k]=arr[j];
                j++;
                 k++;
            }
            
        }
        while(i<=mid){
            c[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            c[k]=arr[j];
            j++;
            k++;
        }
        for(int idx=0;idx<totalLength;idx++){
            arr[start+idx]=c[idx];
        }
    }
    public static  void main(String[] args){
        int[] arr=new int[]{20,60,80,50,30};
        int n=arr.length;
        System.out.println("before merge sort: "+Arrays.toString(arr));
        mergeSort(arr, 0,n-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    
}
