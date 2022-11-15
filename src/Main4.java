public class Main4 {
    public static void main(String[] argv){
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.setX(4);
        r.setY(7);

        System.out.println(r);

        System.out.println(r.toString());

        Rectangle r2 = new Rectangle(new Point(1, 1), 8, 6);
        System.out.println(r2);

        Rectangle r3 = new Rectangle(new Point(2, 2), new Point(5, 8));
        System.out.println(r3);

        Rectangle r4 = new Rectangle(new Point(5, 6), 10, 8);
        System.out.println(r4);
        System.out.println("Top left: " + r4.getTopLeftPoint() + " Top right: " + r4.getTopRightPoint() + " Bottom left: " + r4.getBottomLeftPoint() + " Bottom right: " + r4.getBottomRightPoint());
    }
}