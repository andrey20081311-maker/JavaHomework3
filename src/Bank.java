public class Bank {
    private String bankName;
    private int bankCode;
    private BankAccount account1;
    private BankAccount account2;

    public Bank(String bankName, int bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public void setAccounts(BankAccount a, BankAccount b) {
        this.account1 = a;
        this.account2 = b;
    }

    public double getTotalBalance() {
        return this.account1.getBalance() + this.account2.getBalance();
    }

    public String getBankInfo() {
        String answer = "Bank name: " + this.bankName;
        answer += "\n" + "Bank Code: " + this.bankCode;
        answer += "\n" + account1.getAccountInfo();
        answer += "\n" + account2.getAccountInfo();
        return answer;
    }

    public String getBankName() {
        return this.bankName;
    }
}
