//The println() method from PrintStream class is mainly used for printing in Java
//The printf method in Java can be used to output a formatted string to the console using various format specifiers. It is also an overloaded method of the PrintStream class. 

public class FormattingWithprintfmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * formatting strings using printf in Java, we have the %s specifier
	 * % - format specifier, %s - for string, %n - for newline, '%S' - string with uppercase
	 */
		
		System.out.printf("%s%n", "hello world!");
		System.out.printf("'%S' %n", "hello world!");
		
	}

}
