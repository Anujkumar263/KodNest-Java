public class New {

	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		String s3 = new String("Raja");
		String s4 = new String("Raja");
		
		
		if (s1 == s2) {
			System.out.println("REf are Same");
		}
		else {
			System.out.println("REf are NOT  Same");
		}
		
		if (s3 == s4) {
			System.out.println("REf are Same");
		}
		else {
			System.out.println("REf are NOT  Same");
		}

	}

}