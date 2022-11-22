public class Polygon extends Point{
    private Point[] polygon = new Point[1];

    public Polygon(){
        polygon[0] = new Point();
    }

    public Polygon(Point... points){
        polygon = points;
    }

    public String toString(){
        if(polygon.length == 1) {
            return String.valueOf(polygon[0]);
        }
        else{
            return String.valueOf(polygon[0]) + " - " + polygon[1] + " - "  + polygon[2] + " - "  + polygon[3] + " - "  + polygon[0];
        }
    }

    public double getLength(){
        double length = 0;
        for(int i = 0; i < polygon.length; i++){
            if (i == polygon.length-1){
                Segment s = new Segment(polygon[0], polygon[i]);
                length += s.getModule();
            }
            else{
                Segment s = new Segment(polygon[i], polygon[i+1]);
                length += s.getModule();
            }
        }
        return length;
    }

    public void setOffset(int offX, int offY){
        for(int i = 0; i < polygon.length; i++){
            polygon[i].setX(polygon[i].getX() + offX);
            polygon[i].setY(polygon[i].getY() + offY);
        }
    }
}