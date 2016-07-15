package A2;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Jayashree on 11-07-2016.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        findPrimeFactors(num);
    }

    public static void findPrimeFactors(int num) {
        ArrayList<Integer> prime = new ArrayList<Integer>();


        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                prime.add(i);

                num /= i;
                
            }

        }

        System.out.println(prime);
    }
}