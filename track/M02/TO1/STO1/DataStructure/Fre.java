
public class Fre {

    void count(int[] arr, int key) {

        int count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + ": " + count);
    }
}
