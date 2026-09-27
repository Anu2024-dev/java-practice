package OopsPrac;

public class Encapsulation {
    static class BankAcc{
        private double balance;

        public BankAcc(double balance) {
            this.balance=balance;
        }
        
    public void deposit(double amount){
        balance=balance+amount;
        
    }
    private void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
        }else{
            System.out.println("insufficient");
        }
    }
    
    public double getBalance(){
        return balance;
    }
    }

    public static void main(String[] args) {
        BankAcc A=new BankAcc(2000.90);
        System.out.println(A.getBalance());
        A.deposit(3000);
        System.out.println(A.getBalance());
       A.withdraw(900);
       System.out.println(A.getBalance());

    }

}
