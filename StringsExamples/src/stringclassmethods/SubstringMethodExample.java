//Substring in Java

package stringclassmethods;

public class SubstringMethodExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String name1 = "Subhadip Saha";
        System.out.println(name1.substring(4));
        System.out.println(name1.substring(4, 12));
        System.out.print("\n");
        String name2 = "SubhadipSaha";
        System.out.println(name2.substring(4));
        System.out.println(name2.substring(4, 12));
	}

}

/*
public String substring(int startIndex); //returns the string from startIndex to end of the string
public String substring(int startIndex, int endIndex): //returns the string from startIndex to endIndex-1

In case of String:

startIndex: inclusive
endIndex: exclusive

adip Saha
adip Sah

adipSaha
adipSaha

*/