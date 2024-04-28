public class BankAccount {
    public BankAccount(double balance) {
        this.balance = balance;
    }

    private double balance;
    public double getBalance(){
        return balance;
    }
    public void setBalance(double amt){
        balance = amt;
    }
}
