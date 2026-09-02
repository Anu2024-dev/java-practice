import java.util.*;
public class greedPrac {
    public static int greedy(int[] g,int[] c){
        int n=g.length;
        int m=c.length;
        Arrays.sort(g);
        Arrays.sort(c);
        int l=0;//g arr
        int r=0;//c arr
        while(l<n && r<m){
            if(c[r]>=g[l]){
                l++;
            }
            r++;
        }
        return  l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of greedy arr:");
        int n=sc.nextInt();
        int[] g=new int[n];
        for(int i=0;i<n;i++){
            g[i]=sc.nextInt();
        }
        System.out.println("Enter size of cookie arr:");
        int m=sc.nextInt();
        int[] c=new int[m];
        for(int i=0;i<m;i++){
            c[i]=sc.nextInt();
        }
        int ans=greedy(g,c);
        System.out.println("number of children who gets cookies:"+ans);

    }
}
