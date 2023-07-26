package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        int i, j;
        System.out.print("\n");
        for (i = 1; i <= length; i++) {
            for (j = 1; j <= height; j++) {

                if (i == 1 || i == length) {
                    System.out.print("8");
                } else {

                    if (j == 1 || j == height) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}








