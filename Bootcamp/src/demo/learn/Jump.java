package demo.learn;

public class Jump {
    private int rope = 1;
    protected boolean outside;
    public Jump() {
        // line p1
        this(4);
        outside = true;
    }
    public Jump(int rope) {
        this.rope = outside ? rope : rope+1;
        System.out.println(outside);
    }
    public String hello(){
        return null;
    }

    public int hello(int x){
        return 0;
    }
    public final static void main(String... bounce) {
        System.out.println(new Jump().rope);
        System.out.println(new Jump().outside);
        var flavours = 30;
        int eaten = 0;
        switch (flavours){
            case 30:eaten++;
            case 40: eaten+=2;
            default:eaten--;
        }
        System.out.println(eaten);
    }
}
