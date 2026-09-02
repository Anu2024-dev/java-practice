
import java.util.*; 
public class lgst {
    public static int find_largest(int[] arr) {
       int n=arr.length;
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        largest=Math.max(largest,arr[i]);
       }
       int second_largest=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(arr[i]!=largest && arr[i]>second_largest){
            second_largest=arr[i];
        }
       }
       return second_largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println("Enter the value of k:");
        //int k = sc.nextInt();
        int result = find_largest(arr);
        System.out.println(result);
        sc.close();
    }
}
