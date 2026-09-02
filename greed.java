import java.util.*;
public class greed {
    public static int fun(int stu[],int cook[]){
        int n=stu.length;
        int m=cook.length;
        Arrays.sort(stu);
        Arrays.sort(cook);
        int l=0;
        int r=0;
        while(l<n && r<m){
            if(cook[r]>=stu[l]){
                l++;
            }
            r++;
        }
        return l;

    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int stu[] = new int[n];
    int cook[]=new int[m];
    for(int i=0;i<n;i++){
        stu[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
        cook[i]=sc.nextInt();
    }
    int ans=fun(stu,cook);
    System.out.println(ans);
   } 
}
