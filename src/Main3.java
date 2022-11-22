public class Main3 {
    public static void main(String[] argv){
        Point p1 = new Point(4, 5);
        Point p2 = new Point(6, 8);
        Segment s = new Segment(p1, p2);

        s.setOffset(4, 4);
        System.out.println("New points of the segment: " + s);
        System.out.println("Its module is: " + s.getModule());

        Segment s2 = new Segment();
        System.out.println(s2);
        s2.setStartPoint(new Point(1, 1));
        s2.setEndPoint(new Point(3, 3));
        System.out.println(s2.getStartPoint());
        System.out.println(s2.getEndPoint());
    }
}