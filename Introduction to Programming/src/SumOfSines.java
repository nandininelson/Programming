//https://introcs.cs.princeton.edu/java/12types/SumOfSines.java.html
//prints the value of sin(2t) + sin(3t).
public class SumOfSines {
    public static void main(String args[]){
        double degrees = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degrees);
        System.out.println(Math.sin(2* radians)+Math.sin(3*radians));
    }
}
