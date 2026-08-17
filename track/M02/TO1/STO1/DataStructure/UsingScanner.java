
import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Enter the array element");
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
    }

}
