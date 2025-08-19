package stringBufferMethods;

public class StringBufferMethodOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str1 = new StringBuffer("Welcome to ");
		str1.append("JAVA World");
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer("Welcome to JAVA World!!! ");
		str2.insert(11,"Shelji's ");
		System.out.println(str2);
		
		StringBuffer str3 = new StringBuffer("Welcome to JAVA World");
		str3.delete(11,15);
		System.out.println(str3);
		
		StringBuffer str4 = new StringBuffer("Welcome to JAVA Project");
		str4.replace(11,15,"Shelji's World");
		System.out.println(str4);
		
	}

}
