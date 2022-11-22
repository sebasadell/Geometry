public class Segment extends Point{
    private Point startPoint;
    private Point endPoint;

    public Segment(){
        startPoint = new Point(0, 0);
        endPoint = new Point(0, 0);
    }

    public Segment(Point point1, Point point2){
        startPoint = point1;
        endPoint = point2;
    }

    public double getModule(){
        int x = endPoint.getX() - startPoint.getX();
        int y = endPoint.getY() - startPoint.getY();
        double sqrt = Math.sqrt((x * x + y * y));
        return sqrt;
    }

    public String toString(){
        String s = "(" + startPoint.getX() + ", " + startPoint.getY() + ") - (" + endPoint.getX() + ", " + endPoint.getY() + ")";
        return s;
    }

    public void setOffset(int offX, int offY){
        startPoint.setX(startPoint.getX() + offX);
        startPoint.setY(startPoint.getY() + offY);
        endPoint.setX(endPoint.getX() + offX);
        endPoint.setY(endPoint.getY() + offY);
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