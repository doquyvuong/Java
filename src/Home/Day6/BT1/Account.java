package Day6.BT1;

public class Account {
    String customerName;
    String accountNumber;
    int accountBalance;


    public Account() {
        this.customerName = "Unknown";
        this.accountNumber = "000000";
        this.accountBalance = 0;
    }


    public Account(String customerName, String accountNumber, int accountBalance) throws InsufficientFundsException {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        if (accountBalance < 100) {
            throw new InsufficientFundsException("Số dư tài khoản phải ít nhất là 100.");
        }
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.accountBalance);
    }

}

