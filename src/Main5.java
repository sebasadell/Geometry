public class Main5 {
    public static void main(String[] argv){
        Point arrayPoints[] = new Point[10];
        for(int i=0; i < arrayPoints.length; i++){
            arrayPoints[i] = new Point(i, i);
        }

        Rectangle arrayRectangles[] = new Rectangle[10];
        for(int i = 0; i < arrayRectangles.length; i++){
            arrayRectangles[i] = new Rectangle(arrayPoints[i], 1, 1);
            System.out.println(arrayRectangles[i]);
        }
    }
}