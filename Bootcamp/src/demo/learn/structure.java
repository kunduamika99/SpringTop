package demo.learn;




interface AddNumbers {
    int add(int x, int y);
    static int subtract(int x, int y) { return x-y; }
    default int multiply(int x, int y) { return x*y; }
}
public class structure {
    protected void calculate(AddNumbers n, int a, int b)
    {
        System.out.println(n.add(a, b));
    }
    public static void main(String[] moreNumbers) {
        final var ti = new structure() {};
        AddNumbers ad = new AddNumbers() {
            @Override
            public int add(int x, int y) {
                return x+y+1;
            }
        };
        AddNumbers ad1 = (p,k)->p+k+1;
        ti.calculate(ad, 2, 5);  // j1
        ti.calculate(ad1, 3, 6);  // j1
        ti.calculate((p,k)->p+k+1, 4, 7);  // j1
    } }

