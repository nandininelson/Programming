//https://introcs.cs.princeton.edu/java/12types/Quadratic.java.html
public class Quadratic {

    //quadratic formula
    public static void main(String[] args) {
        double b = 20.0; //Double.parseDouble(args[0]);
        double c = 5.0; //Double.parseDouble(args[1]);

        double discriminant = b*b - 4.0*c;
        double sqroot =  Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        System.out.println(root1);
        System.out.println(root2);
    }
}
