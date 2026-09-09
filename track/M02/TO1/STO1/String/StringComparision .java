
class StringCompagitrision {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s1 = "java";
        String s2 = "javA";

        if (s1 == s2) {
            System.out.println("REf are Same");
        } else {
            System.out.println("REf are NOT  Same");
        }

        /*
		if(s1.equals(s2)) {
			System.out.println("String are same");
		}
		else {
			System.out.println("String are  not same");
		}
         */
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("String are same");
        } else {
            System.out.println("String are  not same");
        }

    }

}
