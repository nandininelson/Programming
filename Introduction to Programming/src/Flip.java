//https://introcs.cs.princeton.edu/java/13flow/Flip.java.html
public class Flip {

    //cin flip
    public static void main(String[] args) {

        // Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the time
        if (Math.random() < 0.5) System.out.println("Heads");
        else                     System.out.println("Tails");
    }
}
