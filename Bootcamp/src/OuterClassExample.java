class OuterClass{
    public static String outerName = "outer";
    public String outerNonStaticName = "outer non static";

    public static class NestedStaticClass{
        public static String innerStaticName = "inner Static";
        public String innerNonStaticName = "inner non static";
        public void innerStaticMethod(){
            System.out.println(new OuterClass().outerNonStaticName);
            System.out.println(outerName);  //inner class can access outer class members
        }
    }

    public class nestedClass{
        public String outerName="inner nested";         //Shadowing
        public void innerMethod(){
            System.out.println(new OuterClass().outerNonStaticName);
            System.out.println(OuterClass.this.outerNonStaticName);
            System.out.println(outerNonStaticName);
            System.out.println(outerName);   //inner class can access outer class members
            System.out.println(OuterClass.outerName);
        }
    }

    public void outerMethod(){
        System.out.println(new NestedStaticClass().innerNonStaticName);
        System.out.println(NestedStaticClass.innerStaticName);

        //Abstract class
        abstract class AbsLocal{
            public abstract void abstractMethod();
        }

        //local class
        class LocalClass extends AbsLocal{
            String name;

            public LocalClass() {
            }

            public LocalClass(String name){
                if(name == null){
                    this.name = outerNonStaticName;
                }else{
                    this.name = name;
                }
            }

            public void display(){
                System.out.println("From local class method "+ name);
            }

            @Override
            public void abstractMethod() {
                System.out.println("Local Abstract Class");
            }
        }
        LocalClass obj1 = new LocalClass(null);
        obj1.display();
        new LocalClass("Anamika").display();
    }

}
public class OuterClassExample {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.outerMethod();
        new OuterClass.NestedStaticClass().innerStaticMethod();
        OuterClass.nestedClass inner = obj.new nestedClass();
        inner.innerMethod();

    }
}
