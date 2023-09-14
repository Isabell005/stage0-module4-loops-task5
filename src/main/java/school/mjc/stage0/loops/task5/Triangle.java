package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            // Print '8's in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println(); // Move to the next line
        }
    }
}
