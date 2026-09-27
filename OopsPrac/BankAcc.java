package OopsPrac;

class BankAcc{
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