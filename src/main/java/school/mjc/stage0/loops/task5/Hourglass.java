package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int sp = 0; // there are 0 spaces in first row  int st = n; // there are n stars in first row
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= sp; j++) // for printing spaces
            {
                System.out.print("	");
            }
            for (int j = 1; j <= height; j++) {
                System.out.print("*	");
            }
            if (i <= height / 2) {
                height -= 2;
                sp++;
            } else {
                height += 2;
                sp--;
            }

            System.out.println();
        }
    }
}



