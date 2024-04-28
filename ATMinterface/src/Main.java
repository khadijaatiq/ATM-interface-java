//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter balance");
        double balance = sc.nextDouble();
        BankAccount acc = new BankAccount(balance);
        ATMmachine atm = new ATMmachine();
        int exit;
        do {
            System.out.println("Menu:");
            System.out.println("1: deposit\n2: withdraw\n3: check balance");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit ");
                    double dep = sc.nextDouble();
                    atm.deposit(dep, acc);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    double wd = sc.nextDouble();
                    atm.withdraw(wd, acc);
                    break;
                case 3:
                    atm.checkBalance(acc);
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Enter 0 to exit atm or press 1 to continue");
            exit = sc.nextInt();
            }while (exit!=0);

    }
}