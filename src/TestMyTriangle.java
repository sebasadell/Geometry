public class TestMyTriangle {
    public static void main(String[] argv){
        Triangle t1 = new Triangle(0, 0, 2, 0, 0, 2);
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.printType());

        Triangle t2 = new Triangle(new Point(0, 0), new Point(5, 0), new Point(0, 2));
        System.out.println(t2.printType());
    }
}