//stringbuffer offers string mutability

package stringbufferdemo;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbf = new StringBuffer("Subhadip");
		//System.out.println(sbf);		//it prints Subhadip
		
		//I want to change the value of the object.
		//sbf = "Subhadip Saha";	//type mismatch, can't convert string to stringbuffer
		/*	
		//use append method instead
		sbf.append("Subhadip Saha");
		System.out.println(sbf);		  //it prints  SubhadipSubhadip Saha
												   
		*/
		//To print only Subhadip Saha
		sbf.append(" Saha");
		System.out.println(sbf);		//Subhadip Saha
		
		sbf.replace(0, 8, "Ashutosh");
		System.out.println(sbf);		//Ashutosh Saha
		
		sbf.delete(4, 8);
		System.out.println(sbf);		//Ashu Saha
		
	}

}
