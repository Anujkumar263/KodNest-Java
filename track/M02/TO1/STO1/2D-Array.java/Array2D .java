
import java.util.*;

public class Array2D {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][5];
        System.out.println("Enter the arrray elements: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array element are: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
