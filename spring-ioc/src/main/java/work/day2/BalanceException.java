package work.day2;

public class BalanceException extends Exception{
    public BalanceException() {
        super("Balance Exception !!!!! Check your balance");
    }

    public BalanceException(String message) {
        super(message);
    }
}
