public class MainPolygon {
    public static void main(String[] argv){
        Polygon p = new Polygon();
        System.out.println(p);

        Polygon p2 = new Polygon(new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(0, 2));
        p2.toString();
        System.out.println(p2.getLength());
        //System.out.println(p2.setOffset(1, 1));
    }
}
