import java.util.*;
public class booster{
    public static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean  sum_of_prime(int num){
        for(int i=1;i<num/2;i++){
            if( isPrime(i) && isPrime(num-i)){
                return  true;
            }
        }
        return  false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean res=sum_of_prime(num);
        System.out.println(res);
}
}