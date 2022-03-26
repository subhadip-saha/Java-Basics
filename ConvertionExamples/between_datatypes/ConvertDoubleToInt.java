//How to convert a double to int in Java
//Reference: https://www.educative.io/edpresso/how-to-convert-a-double-to-int-in-java

package between_datatypes;

public class ConvertDoubleToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1. Typecasting
		//3.6987 -> 3
		
		double doubleValue = 3.6987;
		int integerValue = (int) doubleValue;
		System.out.println(doubleValue + " converted to " + integerValue);
		
		//Approach 2. Using Math.round()
		double dblValue = 3.6987;
		int intValue = (int) Math.round(dblValue);
		System.out.println(dblValue + " converted to " + intValue);
	}

}
