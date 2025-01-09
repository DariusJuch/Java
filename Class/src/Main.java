    public class Main {

    public static  void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getArea());

        Circle c2 = new Circle(1.2);
        System.out.println(c2);
        System.out.println(c2.getArea());

        Circle c3 = new Circle(2.2, "Black" );
        System.out.println( c3);
        System.out.println(c3.getArea());

        Circle2 c4 = new Circle2(4.2);
        System.out.println(c4);
        System.out.println(c4.getArea());
        System.out.println(c4.getCircumference());

        Rectangle rec = new Rectangle(2.5f, 2.5f);
        System.out.println(rec);
        System.out.println(rec.getPerimeter());
        System.out.println(rec.getArea());

        Employee e1 = new Employee(1, " Darius", "dasdasd", 500 );
        System.out.println(e1);
        System.out.println(e1.raiseSalary(50));
        System.out.println(e1.getAnnualSalary());




    }



}
