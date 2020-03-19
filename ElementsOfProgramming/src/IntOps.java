//https://introcs.cs.princeton.edu/java/12types/IntOps.java.html
public class IntOps {

    //integer multiplication and division
    public static void main(String args[]){
        int a = 20; // Integer.parseInt(args[0]);
        int b = 5; // Integer.parseInt(args[1]);
        int sum  = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem  = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
    }
}
