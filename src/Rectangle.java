public class Rectangle extends Point{
    private Point bottomLeftPoint;
    private int width;
    private int height;

    public Rectangle(){
        bottomLeftPoint = new Point();
        width = 0;
        height = 0;
    }

    public Rectangle(Point p, int newWidth, int newHeight){
        bottomLeftPoint = p;
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(Point p1, Point p2){
        bottomLeftPoint = p1;
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }

    public Rectangle(Segment seg){
        bottomLeftPoint = seg.getStartPoint();
        width = seg.getEndPoint().getX() - bottomLeftPoint.getX();
        height = seg.getEndPoint().getY() - bottomLeftPoint.getY();
    }

    public String toString(){
        return bottomLeftPoint + "- Width: " + width + " - Height: " + height;
    }

    public int getArea(){
        return width * height;
    }

    public Point getPoint(){
        return bottomLeftPoint;
    }

    public Point getTopLeftPoint(){
        return new Point(bottomLeftPoint.getX(), bottomLeftPoint.getY()+height);
    }

    public Point getTopRightPoint(){
        return new Point(bottomLeftPoint.getX()+width, bottomLeftPoint.getY()+height);
    }

    public Point getBottomLeftPoint(){
        return bottomLeftPoint;
    }

    public Point getBottomRightPoint(){
        return new Point(bottomLeftPoint.getX()+width, bottomLeftPoint.getY());
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int newWidth){
        width = newWidth;
    }

    public void setHeight(int newHeight){
        height = newHeight;
    }
}