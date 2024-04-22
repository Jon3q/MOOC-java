
public class YourFirstBankTransfer {

    public static void main(String[] args) {
       Account account = new Account("Matthews account", 1000);
       Account myAccount = new Account("My account", 0);
       account.withdrawal(100);
       myAccount.deposit(100);
       System.out.println(account);
       System.out.println(myAccount);
    }
}
