package demo.learn;

public class MyGenericClass<T> {
    T val;

    public MyGenericClass(T val) {
        this.val = val;
    }

    public void print(){
        System.out.println(this.val.getClass().getName());
    }

    public static void main(String[] args) {
        MyGenericClass<String> mgec = new MyGenericClass<String>("LTI");
        mgec.print();
        MyGenericClass<Integer> mint = new MyGenericClass<Integer>(50);
        mint.print();
        var mychar = new MyGenericClass<Character>('a');
        mychar.print();
    }

}
