interface IShape{
    void area(int length, int breadth);
    void perimeter(int length, int bredth);
}

//Interface implemented using named class
class Rectangle implements IShape{

    @Override
    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle  = "+ (length*breadth));
    }

    @Override
    public void perimeter(int length, int breadth) {
        System.out.println("Permineter of Rectangle  = "+ (length+breadth));
    }
}
public class AnonymousExample {

    public static void main(String[] args) {
        new Rectangle().area(10,20);
        IShape r1 = new Rectangle();
        r1.area(50,20);
//        IShape r3 = new Rectangle();
//        r3.area(30,20);
        //Interface implemented using anonymous class
        IShape rectangle  = new IShape() {
            String len="Anamika";
            @Override
            public void area(int length, int breadth) {
                System.out.println("Area = "+ (length*breadth));
            }

            @Override
            public void perimeter(int length, int breadth) {
                System.out.println("Perimeter = "+ (length+breadth));
            }

            public String toString(){
                return len +" Kundu";
            }
        };
        rectangle.area(20,30);
        rectangle.perimeter(40,80);
        System.out.println(rectangle);

    }
}
