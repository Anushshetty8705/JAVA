import java.util.*;

public class Solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++)
                System.out.print('*');
            System.out.println();
        }

    }
}