public class Polygon extends Segment{
    private Point[] point;

    public Polygon(){
        point = new Point[0];
    }

    public Polygon(Point p, Point p2, Point p3, Point p4){
        super(p.getX(), p.getY());
        point[0] = p;
        point[1] = p2;
        point[2] = p3;
        point[3] = p4;
    }

    public String toString(){
        return point[0] + " - " + point[1] + " - " + point[2] + " - " + point[3] + " - " + point[0];
    }

    public double getLength(){
        double length = 0;
        for(int i = 0; i < point.length; i++){
            if (i == point.length-1){
                Segment s = new Segment(point[0], point[i]);
                length += s.getModule();
            }
            else{
                Segment s = new Segment(point[i], point[i+1]);
                length += s.getModule();
            }
        }
        return length;
    }

    public void setOffset(int offX, int offY){
        for(int i = 0; i < point.length; i++){
            point[i].getX() += offX;
            point[i].getY() += offY;
        }
    }
}