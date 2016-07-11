package A2;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Jayashree on 11-07-2016.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<Integer>();
        //int num = Integer.parseInt(args[0]);
        int num=54;
        while (num % 2 == 0) {
            prime.add(2);

            num /= 2;
        }
        for (int i = 3; i <=num;i++) {
            while (num % i == 0) {
                prime.add(i);

                num /= i;
            }

        }
        System.out.println(prime);
    }
}