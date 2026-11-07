public class Main {
    public static void main(String[] args) {
        BankAccount account1, account2;
        account1 = new BankAccount("Shalom", 207792.08);
        account2 = new BankAccount("Moshe", 180340.66);
        System.out.println("Account's ID: " + account1.getAccountId());
        System.out.println("Account's ID: " + account2.getAccountId());
        account1.deposit(500);
        account2.deposit(200);
        account1.transferTo(account2, 300);
        System.out.println(account1.withdraw(210000));
        System.out.println(account2.withdraw(190000));
        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());
        System.out.println("There is " + BankAccount.getTotalAccounts() + " accounts");
        System.out.println("The next accounts id is: " + BankAccount.getNextAccountId());
        BankAccount account3;
        account3 = new BankAccount("Hagit", 543001.22);
        System.out.println("Account's ID: " + account3.getAccountId());
        System.out.println(account3.deposit(-1000000));
        System.out.println(account3.transferTo(account3, 1000000));
        Bank bank1;
        bank1 = new Bank("Leumi", 1234);
        bank1.setAccounts(account1, account3);
        System.out.println(bank1.getBankInfo());
        System.out.println("The total amount of money thats saved in the bank is: " + bank1.getTotalBalance());
    }
}