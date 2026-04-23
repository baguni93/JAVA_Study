package custom;

public class Run {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(500);
        System.out.println("예금액:" +account.getBalance());

        try {
            account.withdraw(1000);
        }
        catch (InsufficientException e) {
            System.err.println(e.getMessage());
        }

        account.withdraw_RunTime(1000);
    }
}
