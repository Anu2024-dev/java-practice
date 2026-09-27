package OopsPrac;


public class Main {
    public static void main(String[] args) {
        BankAcc A=new BankAcc(2000.90);
        System.out.println(A.getBalance());
        A.deposit(3000);
        System.out.println(A.getBalance());
       A.withdraw(900);
       System.out.println(A.getBalance());

    }
}
