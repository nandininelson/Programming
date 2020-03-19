//https://introcs.cs.princeton.edu/java/12types/Distance.java.html
// Euclidean distance from the point (x, y) to the origin (0, 0).
public class Distance {

    public static void main(String args[]){
        int x = 3; // Integer.parseInt(arg[0]);
        int y = 4; //Integer.parseInt(arg[1]);

        double pythagoras = Math.sqrt((x*x)+(y*y));
        System.out.println(String.format("Distance from (%d,%d) to (0,0) is %f ", x, y, pythagoras));
    }
}
