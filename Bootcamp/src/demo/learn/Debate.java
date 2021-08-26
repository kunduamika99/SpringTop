package demo.learn;

interface Speak {
     default int getVolume() { return 20; }
}
interface Whisper {
     default int getVolume() { return 10; }
}

class sound implements Whisper, Speak{

    public int getVolume() {
        return 40;
    }

    public void main(String a){
        var don = new sound();
        String args = "ui";
        int f = 0;
        System.out.println(Speak.super.getVolume());
    }
}

public class Debate implements Speak, Whisper {
    public int getVolume() { return 30; }
    public static void main(String[] a) {
        var d = new sound();
        d.main("pool");
    }
}