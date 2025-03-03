import java.util.Scanner;
public class MyOop{
	public static void main(String args[]){
	

	Scanner input=new Scanner(System.in);
	

     	byte bnum;
	short snum;
	long lnum;
        int inum;

	//primitive numerical datatypes

	System.out.print("Enter a byte value: ");
	bnum= input.nextByte();
	System.out.printf("The byte you entered is: %d\n",bnum);

	System.out.print("Enter a short value: ");
	snum= input.nextShort();
	System.out.printf("The short you entered is: %d\n",snum);

	System.out.print("Enter a long value: ");
	lnum= input.nextLong();
	System.out.printf("The long you entered is: %d\n",lnum);

	System.out.print("Enter an integer value: ");
	inum= input.nextInt();
	System.out.printf("The integer you entered is: %d\n",inum);
        

	//primitive decimal datatypes

        
        double dnum;
	
	System.out.print("Enter a float value: ");
	float fnum= input.nextFloat();
	input.nextLine();
	System.out.printf("The float you entered is: %.2f\n",fnum);
        
	System.out.print("Enter a double value: ");
	dnum= input.nextDouble();
	System.out.printf("The byte you entered is: %.3f\n",dnum);


 	// for boolean
  	boolean istrue;
	System.out.print("Enter a boolean value: ");
	istrue=input.nextBoolean();
	System.out.printf("The value of boolean you entered is: %b\n", istrue);



     //primitive data types

	String str;
	char c;
 
	System.out.print("Enter a String: ");
	str=input.next();
	System.out.printf("The String you entered is: %s\n", str);

	System.out.print("Enter a character value: ");
	c=input.next().charAt(0);
	System.out.printf("The value of character you entered is: %s\n", c);
        
	
	
	
	
	}




}
