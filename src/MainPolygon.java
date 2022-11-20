public class MainPolygon {
    public static void main(String[] argv){
        Polygon p = new Polygon();
        System.out.println(p);

        Point[] p2 = new Point[4];
        p2[0] = new Point(0, 0);
        p2[1] = new Point(0, 2);
        p2[2] = new Point(2, 0);
        p2[3] = new Point(2, 2);
        Polygon polygon = new Polygon(p2);
        System.out.println("The length of the polygon is: " + polygon.getLength());
        polygon.setOffset(1, 1);
        System.out.println(polygon);
    }
}