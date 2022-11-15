public class Segment extends Point{
    private Point startPoint;
    private Point endPoint;

    public Segment(){
        startPoint = new Point();
        endPoint = new Point();
    }

    public Segment(Point point1, Point point2){
        super(point1.getX(), point1.getY());
        startPoint = point1;
        endPoint = point2;
    }

    public double getModule( Point point1, Point point2){
        int x = point2.getX() - point1.getX();
        int y = point2.getY() - point1.getY();
        double sqrt = Math.sqrt((x * x + y * y));
        return sqrt;
    }

    public String toString(){
        return "(" + startPoint.getX() + ", " + startPoint.getY() + ") - (" + endPoint.getX() + ", " + endPoint.getY() + ")";
    }

    public void setOffset(int offX, int offY){
        startPoint.getX() += offX;
        startPoint.getY() += offY;
        endPoint.getX() += offX;
        endPoint.getY() += offY;
    }

    public void setStartPoint(Point newStartPoint){
        startPoint = newStartPoint;
    }

    public void setEndPoint(Point newEndPoint){
        endPoint = newEndPoint;
    }

    public Point getStartPoint(){
        return startPoint;
    }

    public Point getEndPoint(){
        return endPoint;
    }
}