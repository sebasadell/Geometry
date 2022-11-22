public class Main4 {
    public static void main(String[] argv){
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.setX(4);
        r.setY(7);
        r.setWidth(5);
        r.setHeight(5);
        System.out.println(r);

        Rectangle r2 = new Rectangle(new Point(1, 1), 8, 6);
        System.out.println(r2);
        System.out.println("Area of r2 is: " + r2.getArea());

        Rectangle r3 = new Rectangle(new Segment(new Point(0, 0), new Point(2, 2)));
        System.out.println(r3);
        System.out.println("Width: " + r3.getWidth());
        System.out.println("Heigth: " + r3.getHeight());

        Rectangle r4 = new Rectangle(new Point(5, 6), new Point(15, 14));
        System.out.println(r4);
        System.out.println("Top left: " + r4.getTopLeftPoint() + " // Top right: " + r4.getTopRightPoint() + " // Bottom left: " + r4.getBottomLeftPoint() + " // Bottom right: " + r4.getBottomRightPoint());
    }
}