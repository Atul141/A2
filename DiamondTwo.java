package A2;

/**
 * Created by Jayashree on 05-07-2016.
 */
public class DiamondTwo {

    public static void main(String[] args)
    {
        int num=Integer.parseInt(args[0]);
        DiamondOne.isosceles(num);
        centered(num-1,1);
    }
    public static void centered(int num,int k)
    {

        int i,j;
        for(i=num;i>0;i--)
        {
            for(j=num;j>=i-k;j--)
                System.out.print(" ");

            for(j=0;j<(i*2-1);j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
