package A2;

/**
 * Created by Jayashree on 05-07-2016.
 */
public class DiamondThree {

    public static void main(String[] args)
    {
        int num=Integer.parseInt(args[0]);
        DiamondOne.isosceles(num-1);
        printName(num);
        System.out.println();
        DiamondTwo.centered(num-1,0);
    }
    public static void printName(int num)
    {
        for(int i=0;i<num-2;i++)
            System.out.print(" ");
        System.out.print("Atul");
    }
}
