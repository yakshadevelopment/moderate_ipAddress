package java8.mod.ipaddress;
import java.util.Scanner;
public class Main {
	public static boolean checkIpAddress(String ipAddress)
	{
		try
		{
		   if(ipAddress.startsWith("."))
			   throw new Exception();
		   if(ipAddress.endsWith("."))
			   throw new Exception();
		   String []octetArray=ipAddress.split("\\.");
		   if(octetArray.length!=4)
			   throw new Exception();
		   for(String value:octetArray)
		   {
			   int octetNumber=Integer.parseInt(value);
			   if(octetNumber<0 || octetNumber>255)
				   throw new Exception();
		   }
		   return true;
		}
		catch(Exception exception)
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter IP Address:");
		String ipAddress=scanner.nextLine();
		if(checkIpAddress(ipAddress))
		{
		  System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
     }
}
