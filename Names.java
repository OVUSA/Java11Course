import java.util.Scanner;

public class Names {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	String fullName = sc.nextLine();
	
	StringBuffer initials= new StringBuffer();
	
	for ( int i = 0; i < fullName.length(); i++) {
		if (Character.isUpperCase(fullName.charAt(i))) {
			initials.append(fullName.charAt(i));
		}
	}
	
	System.out.println(initials +" "+ fullName);
	
	
	}

}


