package work.day2;

public class AmountException extends Exception{
    public AmountException() {
        super("Amount Exception !!!! Check your account");
    }

    public AmountException(String message) {
        super(message);
    }
}
