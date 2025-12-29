public class Account {
    private double balance;
    public Account(double initialBalance){
        if (initialBalance >=0){
            this.balance = initialBalance;
        }else{
            this.balance = 0;
            System.out.println("Initial balance cannot be negative.Set to $0.00");
        }
    }
    public void deposit(double amount){
        if(amount >0){
            balance+=amount;
            System.out.printf("Successfully deposited $%.2f%n",amount);
            displayBalance();
        }else{
            System.out.println("Error:Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount <=0){
            System.out.println("Error:Withdrawal amount must be positive.");
        }else if (amount > balance){
            System.out.printf("Error:Insufficient funds.You have $%.2f available.%n",balance);
        }else{
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f%n",amount);
            displayBalance();
        }
    }
    public void displayBalance(){
        System.out.printf("Current Balance:$%.2f%n",balance);
    }
    public double getBalance(){
        return balance;
    }
}
