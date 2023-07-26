package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int i, j, k;
        for (i= 0; i<= height-1 ; i++)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=height-1; k++)
            {
                System.out.print("8" + " ");
            }
            System.out.println(" ");
        }
        for (i= height-1; i>= 0; i--)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=height-1; k++)
            {
                System.out.print("8" + " ");
            }
            System.out.println(" ");
        }

    }
}



