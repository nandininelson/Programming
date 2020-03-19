//https://introcs.cs.princeton.edu/java/13flow/Sqrt.java.html
public class SqrtNewtonsMethod {
    public static void main(String[] args) {

        // read in the command-line argument
        double c = 25;//Double.parseDouble(args[0]);
        double epsilon = 1.0e-15;  // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }
}
