import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={15,20,5,45,30,10};
        int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int smallest=arr[i];
        //     int indexOfSmallest=i;
        //     for(int j=i;j<n;j++){
        //         if(smallest>arr[j]){
        //             smallest=arr[j];
        //             indexOfSmallest=j;
        //         }
        //     }
        //     int temp=arr[indexOfSmallest];
        //     arr[indexOfSmallest]=arr[i];
        //     arr[i]=temp;
        // }
        for(int i=0;i<n;i++){
            int highest=arr[0];
            int indexOfHighest=0;
            for(int j=0;j<n-i;j++){
                if(arr[j]>highest){
                    highest=arr[j];
                    indexOfHighest=j;
                }
            }
            int temp=arr[indexOfHighest];
            arr[indexOfHighest]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

