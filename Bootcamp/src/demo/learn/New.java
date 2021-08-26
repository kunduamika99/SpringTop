package demo.learn;


public class New implements Speak1, Whisper1{

    public int getVolume() { return 30; }
    public static void main(String[] a) {
        new New().min();
        StringBuilder sb = new StringBuilder(5);
        sb.append("HOWDY");
        System.out.println(sb);
        sb.insert(0,' ');
        System.out.println(sb);
        sb.replace(3,5,"LL");
        System.out.println(sb);
        sb.insert(6,"COW");
        System.out.println(sb);
        sb.delete(2,7);
        System.out.println(sb);
        System.out.println(sb.length());


    }
    public void min(){
        var d = new Debate();
        System.out.println(Whisper1.super.getVolume());
    }

}

interface Speak1 {
    public default int getVolume() { return 20; }
}
interface Whisper1 {
    public default int getVolume() { return 10; }
}
