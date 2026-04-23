package custom;

public class Account {

    private long balance;

    public Account() {

    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
       if (balance < money) {
           throw new InsufficientException("잔고부족" + (money - balance) +"가 모자람");
       }

        balance -= money;
    }

    public void withdraw_RunTime(int money) {
        if (balance < money) {
            throw new InsufficientRuntimeException("잔고부족" + (money - balance) +"가 모자람");
        }

        balance -= money;
    }
}
