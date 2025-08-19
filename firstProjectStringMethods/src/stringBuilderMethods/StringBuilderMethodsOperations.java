package stringBuilderMethods;

public class StringBuilderMethodsOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str1 = new StringBuilder("Welcome to ");
		str1.append("JAVA World");
		System.out.println(str1);
		
		StringBuilder str2 = new StringBuilder("Welcome to JAVA World!!! ");
		str2.insert(11,"Shelji's ");
		System.out.println(str2);
		
		StringBuilder str3 = new StringBuilder("Welcome to JAVA World");
		str3.delete(11,15);
		System.out.println(str3);
		
		StringBuilder str4 = new StringBuilder("Welcome to JAVA Project");
		str4.replace(11,15,"Shelji's World");
		System.out.println(str4);

	}

}
