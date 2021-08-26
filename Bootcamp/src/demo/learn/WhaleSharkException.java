package demo.learn;

public class WhaleSharkException extends Exception{
    public WhaleSharkException() {
        super("Friendly shark!");
        System.out.println("no param");
    }
    public WhaleSharkException(String message) {
        super(new Exception(new WhaleSharkException()));
        System.out.println("String param");
    }
    public WhaleSharkException(Exception cause) {
    }

    public static void main(String[] args) throws WhaleSharkException {
        throw new WhaleSharkException("hello");
    }
}
