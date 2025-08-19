package stringMethods;

public class StringMethodsOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "java";
		String s2 = "JAVA";
		String s3 = "java";
		String s4 = "Shelji John";
		
		System.out.println("The strings are....");
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
		System.out.println("String 3: " + s3);
		System.out.println("String 4: " + s4);
		
		System.out.println();
		
		System.out.println("The length of " + s1 + " is: " + s1.length());
		System.out.println("The length of " + s2 + " is: " + s2.length());
		System.out.println("The length of " + s3 + " is: " + s3.length());
		System.out.println("The length of " + s4 + " is: " + s4.length());
		
		System.out.println();
		
		System.out.println("Checking the below strings using equals() method...");
		System.out.println("String1: " + s1);
		System.out.println("String2: " + s2);
		System.out.println("Result: " + s1.equals(s2));  
		
		System.out.println();
		
		System.out.println("Checking the below strings using equals() method...");
		System.out.println("String1: " + s1);
		System.out.println("String2: " + s3);
		System.out.println("Result: " + s1.equals(s3)); 
		
		System.out.println();
		
		System.out.println("Checking the below strings using equalsIgnoreCase() method...");
		System.out.println("String1: " + s1);
		System.out.println("String2: " + s2);
		System.out.println("Result: " + s1.equalsIgnoreCase(s2));
		
		System.out.println();
		
		System.out.println("Checking the below strings using equalsIgnoreCase() method...");
		System.out.println("String1: " + s1);
		System.out.println("String2: " + s3);
		System.out.println("Result: " +s1.equalsIgnoreCase(s3)); 
		
		System.out.println();
		
		System.out.println("The string is: " + s1);
		System.out.println("Converting to UPPER CASE..");
		System.out.println("Converted string: " + s1.toUpperCase()); 
		
		System.out.println();
		
		System.out.println("The string is: " + s4);
		System.out.println("Converting to UPPER CASE..");
		System.out.println("Converted string: " + s4.toUpperCase()); 
		
		System.out.println();
		
		System.out.println("The string is: " + s2);
		System.out.println("Converting to LOWER CASE..");
		System.out.println("Converted string: " + s2.toLowerCase());
		
		System.out.println();
		
		System.out.println("The string is: " + s1);
		System.out.println(s1.startsWith("ja")); 
		System.out.println("The string is: " + s2);
		System.out.println(s2.startsWith("ji")); 
		System.out.println("The string is: " + s3);
		System.out.println(s3.startsWith("va")); 
		System.out.println("The string is: " + s1);
		System.out.println(s1.startsWith("JAV")); 
		System.out.println("The string is: " + s4);
		System.out.println(s4.startsWith("John")); 
		
		System.out.println();
		
		System.out.println("The string is: " + s1);
		System.out.println(s1.endsWith("va")); 
		System.out.println("The string is: " + s2);
		System.out.println(s2.endsWith("VA")); 
		System.out.println("The string is: " + s1);
		System.out.println(s1.endsWith("ja")); 
		System.out.println("The string is: " + s4);
		System.out.println(s4.endsWith("hn")); 
		
		System.out.println();
		
		System.out.println("The string is: " + s1);
		System.out.println(s1.charAt(1)); 
		System.out.println("The string is: " + s2);
		System.out.println(s2.charAt(3));
		System.out.println("The string is: " + s2);
		System.out.println(s2.charAt(0)); 
		System.out.println("The string is: " + s3);
		System.out.println(s3.charAt(2)); 
		System.out.println("The string is: " + s4);
		System.out.println(s4.charAt(6)); 
		System.out.println("The string is: " + s4);
		System.out.println(s4.charAt(7)); 
		
		System.out.println();
		
		int a = 10;
		String str1 = String.valueOf(a);
		System.out.println("String value of a is: " + str1);
		
		System.out.println();
		
		double b = 5.75;
		String str2 = String.valueOf(b);
		System.out.println("String value of b is: " + str2);
		
		System.out.println();
		
		boolean c = true;
		String str3 = String.valueOf(c);
		System.out.println("String value of c is: " + str3);

		System.out.println();

	}

}
