
class immutableString {

    public static void main(String[] args) {

        String s1 = "java";  // without using new key word immutable 
        System.out.println(s1);

        System.out.println(s1.toUpperCase());  // convert into upper case

        String res = s1.toUpperCase();
        System.out.println(res);

    }

}
