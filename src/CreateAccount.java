import com.globalpayex.bank.entities.Account;
import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class CreateAccount {

    public static void main(String[] args) {
        Account a = new Account("Savings", "123ABC", 10000);
        System.out.println(a.deposit(1000));

        /* try {
            System.out.println(a.withdraw(0));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } */

        try {
            System.out.println(a.withdraw(900));
        } catch (MinBalNotMaintainedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
