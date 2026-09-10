
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder();

        System.out.println(s1.capacity());//16
        System.out.println(s1.length());//0

        s1.append("java");
        System.out.println(s1.capacity());//16
        System.out.println(s1.length());//4
    }
}
