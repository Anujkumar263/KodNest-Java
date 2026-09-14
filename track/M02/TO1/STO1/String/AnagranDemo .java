
import java.util.Arrays;

class AnagranDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {3, 2, 1, 9, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);   // i want in assending order thenuse in build method

        }

        System.out.println();
        Arrays.sort(arr);     // inbuilt method 
        System.out.println("After Shorting: ");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }

    }

}
