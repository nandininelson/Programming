//https://introcs.cs.princeton.edu/java/12types/SpringSeason.java.html
//takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
public class SpringSeason {
    public static void main(String args[])
    {
        int m = 3;//Integer.parseInt(args[0]);
        int d = 20;//Integer.parseInt(args[1]);

        boolean isSpring=false;
        switch(m){
            case 3: if(d>=20 && d<=31)
                       isSpring=true;
                     break;
            case 4: if(d>=1 && d<=30)
                        isSpring=true;
                    break;
            case 5:if(d>=1 && d<=31)
                        isSpring=true;
                    break;
            case 6:if(d>=1 && d<=20)
                        isSpring=true;
                    break;
        }

        /*boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

         */
        System.out.println(isSpring);
    }
}
