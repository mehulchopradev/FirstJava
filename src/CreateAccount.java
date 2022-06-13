import com.globalpayex.bank.entities.Account;
import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

import java.util.Optional;

public class CreateAccount {

    public static void main(String[] args) {
        Account a = new Account("Savings", "123ABC", 10000);
        // System.out.println(a.deposit(1000));
        a.getDetails().ifPresent(details -> System.out.println(details.toUpperCase()));

        /* try {
            System.out.println(a.withdraw(0));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } */

        /* try {
            System.out.println(a.withdraw(900));
        } catch (MinBalNotMaintainedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } */

        // System.out.println(a.getDetails().toUpperCase());

        Account emptyAccount = new Account(null, null, 0);
        // System.out.println(emptyAccount.getDetails().toUpperCase());
        // null checks
        /* String d = emptyAccount.getDetails();
        if (d != null) {
            System.out.println(d.toUpperCase());
        } */

        // Optional
        /* Optional<String> optional = emptyAccount.getDetails();
        if (optional.isPresent()) {
            System.out.println(optional.get().toUpperCase());
        } */

        /* emptyAccount
                .getDetails()
                .ifPresent(details -> System.out.println(details.toUpperCase())); */
        emptyAccount
                .getDetails()
                .ifPresentOrElse(
                        details -> System.out.println(details.toUpperCase()),
                        () -> System.out.println("Account not initialized")
                );

        // set the accType private attribute at a later point in the program
        // emptyAccount.accType = "Xyz";
        emptyAccount.setAccType("Savings");
        emptyAccount.accNumber = "1234ABc";
        // emptyAccount.balance = -10000;
        emptyAccount.setBalance(1000);
        emptyAccount.getDetails().ifPresent(System.out::println);

        System.out.println(emptyAccount.getAccType());
    }
}
