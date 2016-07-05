package A2;

/**
 * Created by Jayashree on 05-07-2016.
 */
public class DiamondOne {

    public static void main(String[] args) {
int num=20;
        //int num=Integer.parseInt(args[0]);
        int i,j;
        for (i = 0; i < num;i++)
        {
            for(j=0;j<=num-i-1;j++)
                System.out.print(" ");
            for(j=0;j<=(i*2);j++)
            System.out.print("*");
            System.out.println();
        }
    }
}
