//Java String replace(), replaceFirst() and replaceAll() method

package stringclassmethods;

public class ReplaceMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str = "This is demo";
	        System.out.println(str.replace("i", "w"));
	        System.out.println(str.replace("i", "wa"));
	        System.out.println(str.replace("is", "w"));
	        System.out.println(str.replace("is", "was"));
	        System.out.println(str.replaceFirst("i", "w"));
	        System.out.println(str.replaceFirst("is", "w"));
	        System.out.println(str.replaceAll("i", "w"));
	        System.out.println(str.replaceAll("is(.)", "was"));     //Thwaswasdemo
	        System.out.println(str.replaceAll("is(.*)", "was"));    //Thwas, it can take regex expression
	        
	        System.out.println();
	        String str2 = "Subha1dip2!@ Saha%^&";
	        System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
	        System.out.println(str2.replaceAll("[a-zA-Z0-9]", ""));
	}

}

/*
Thws ws demo
Thwas was demo
Thw w demo
Thwas was demo
Thws is demo
Thw is demo
Thws ws demo
Thwaswasdemo
Thwas

Subha1dip2Saha
!@ %^&
*/