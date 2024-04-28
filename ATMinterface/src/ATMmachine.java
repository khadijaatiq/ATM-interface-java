public class ATMmachine {
    public void withdraw(double amt, BankAccount acc) {
        try {
            if (amt <= 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount");
            }
            if (acc.getBalance() >= amt) {
                acc.setBalance(acc.getBalance() - amt);
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Insufficient balance");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deposit(double amt, BankAccount acc) {
        try {
            if (amt <= 0) {
                throw new IllegalArgumentException("Invalid deposit amount");
            }
            acc.setBalance(acc.getBalance() + amt);
            System.out.println("Deposit successful");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkBalance(BankAccount acc) {
        System.out.println("Current balance: " + acc.getBalance());
    }
}
