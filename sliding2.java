
import java.util.*;
public class sliding2 {
    public static int[] rearrange(int[] arr){
        //brute force;
        // int len=arr.length;
        // int[] pos=new int[len/2];
        // int[] neg=new int[len/2];
        // int posp=0;
        // int negp=0;
        // for(int i=0;i<len;i++){
        //     if(arr[i]>=0){
        //         pos[posp]=arr[i];
        //         posp++;
        //     }else{
        //         neg[negp]=arr[i];
        //         negp++;
        //     }
        // }
        // for(int i=0;i<len/2;i++){
        //     arr[i*2]=pos[i];
        //     arr[i*2+1]=neg[i];
        // }
        // return  arr;
        //**************optimized way*************
        int len=arr.length;
        int[] ans=new int[len];
        int pos=0;
        int neg=1;
        for(int i=0;i<len;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return  ans;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Put the values: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] res= new int[n];
        res=rearrange(arr);
        for(int elm:res){
            System.out.print(elm+" ");
        }
        sc.close();
}
}
