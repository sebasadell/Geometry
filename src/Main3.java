public class Main3 {
    public static void main(String[] argv){
        Point p1 = new Point(4, 5);
        Point p2 = new Point(6, 8);
        Segment s = new Segment(p1, p2);

        //s.setOffset(4, 4);
        System.out.println("New points of the segment: " + s.getStartPoint() + " - " + s.getEndPoint());

        System.out.println("Its module is: " + s.getModule(p1, p2));
    }
}