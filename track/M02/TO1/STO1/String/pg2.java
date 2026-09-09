
class pg2 {

    public static void main(String[] args) {

        String s1 = "java";           // Array of character
        System.out.println(s1);

        char arr[] = s1.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        String res = new String(arr);
        System.out.println(res);  //array convert into string

    }

}
