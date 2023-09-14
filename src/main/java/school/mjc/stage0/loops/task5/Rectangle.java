package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {

        for (int i = 0; i < length; i++) {
            System.out.print("8");
        }
        System.out.println(); // Move to the next line

        // Print the sides and interior of the rectangle
        for (int i = 2; i < height; i++) {
            System.out.print("8");

            for (int j = 2; j < length; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }
        for (int i = 0; i < length; i++) {
            System.out.print("8");
        }
        System.out.println();
    }
}







