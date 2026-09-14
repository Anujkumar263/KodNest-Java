
import java.util.*;

class PalindromePgm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = scan.nextLine();

        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        String revStr = builder.toString();

        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("Given Strings are Palindrome");
        } else {
            System.out.println("Given Strings are NOT Palindrome");
        }
    }

}
