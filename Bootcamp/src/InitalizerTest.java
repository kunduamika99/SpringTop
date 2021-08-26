class MySuperClass{
    String myVariable;

    public MySuperClass() {
        System.out.println("parent Class COnstructor");
    }
    public void mySetVar(String myVariable){
        this.myVariable = myVariable;

    }

//    public String toString(){
//        return myVariable +"oops";
//    }
}

class MySubClass extends MySuperClass{
    public MySubClass() {
        System.out.println("Child CLass Constructor");
        mySetVar(myVariable);
    }
    MySubClass(String myVariable){
        super();
        System.out.println("Child CLass argument Constructor");
        mySetVar(myVariable);
    }
    {
        this.myVariable = "Child CLass My Variable";
        System.out.println("Child CLass initializer block");
        System.out.println(this);
    }
}

public class InitalizerTest {

    static {
        {
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        MySubClass child = new MySubClass("Hello Child");
        System.out.println(child);
    }
}
