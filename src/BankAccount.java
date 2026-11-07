public class BankAccount {
    private int accountId;
    private String ownerName;
    private double balance;
    private boolean isActive;
    private static int nextId = 1000;
    private static int totalAccounts = 0;


    public BankAccount(String ownerName) {
        this.accountId = nextId;
        this.ownerName = ownerName;
        this.balance = 0;
        this.isActive = true;
        nextId += 1;
        totalAccounts += 1;
    }

    public BankAccount(String ownerName, double initialBalance)
    {
        this.accountId = nextId;
        this.ownerName = ownerName;
        if (initialBalance < 0) {
            this.balance = 0;
        }
        else {
            this.balance = initialBalance;
        }
        this.isActive = true;
        nextId += 1;
        totalAccounts += 1;
    }

    public boolean deposit(double amount) {
        if (isValidAmount(amount) && this.isActive) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (isValidAmount(amount) && this.balance - amount >= 0 && this.isActive) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(BankAccount destination, double amount) {
        if (destination == null || destination.accountId == this.accountId) {
            return false;
        }
        if (this.isActive && destination.isActive && isValidAmount(amount) && this.balance >= amount) {
            this.withdraw(amount);
            destination.deposit(amount);
            return true;
        }
        return false;
    }

    public boolean closeAccount() {
        if (this.isActive && this.balance == 0) {
            this.isActive = false;
            return true;
        }
        return false;
    }

    public String getAccountInfo() {
        String answer = "Account ID: " + this.accountId;
        answer += "\n" + "Account's owner name: " + this.ownerName;
        answer += "\n" + "Account's balance: " + this.balance;
        answer += "\n" + "Account's status: " + this.isActive;
        return answer;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    public static int getNextAccountId() {
        return nextId;
    }

    public int getAccountId() {
        return this.accountId;
    }
    public String getOwnerName() {
        return this.ownerName;
    }
    public double getBalance() {
        return this.balance;
    }
    public boolean getIsActive() {
        return this.isActive;
    }

    public void setOwnerName(String name) {
        if (name != null && !name.isEmpty()) {
            this.ownerName = name;
        }
    }
}
