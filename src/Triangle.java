public class Triangle extends Point {
    private Point v1 = new Point(0, 0);
    private Point v2 = new Point(0, 0);
    private Point v3 = new Point(0, 0);

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
    }

    public Triangle(Point v1, Point v2, Point v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString(){
        return "Triangle @ (" + v1.getX() + ", " + v1.getY() + "), (" + v2.getX() + ", " + v2.getY() + "), (" + v3.getX() + ", " + v3.getY() + ")";
    }

    public double getPerimeter(){
        double perimeter = 0;
        perimeter = distance(v1, v2) + distance( v2, v3) + distance(v3, v1);
        return perimeter;
    }

    public String printType(){
        double side1 = distance(v1, v2);
        double side2 = distance(v2, v3);
        double side3 = distance(v3, v1);

        if(side1 == side2 && side2 == side3){
            return "Equilateral";
        }
        else{
            if(side1 == side2 || side1 == side3 || side2 == side3){
                return "Isosceles";
            }
            else{
                return "Scalene";
            }
        }
    }
}