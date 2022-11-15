public class Point {
    private int x;
    private int y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int x) {
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setOffset(int offsetX, int offsetY){
        x += offsetX;
        y += offsetY;
    }
}