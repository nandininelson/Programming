//https://introcs.cs.princeton.edu/java/12types/SumOfTwoDice.java.html
//sum of two random integers between 1 and 6 (such as you might get when rolling dice).
public class SumOfTwoDice {

    public static final int FACES = 6;

    public static void main(String args[]){
        int d1 = 1+ (int)(Math.random()* FACES);
        int d2 = 1 + (int)(Math.random()*FACES);

        System.out.println(String.format("Sum of two dices = %d ", (d1+d2)));
    }
}
