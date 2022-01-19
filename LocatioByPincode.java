import java.util.Scanner;

public class LocatioByPincode {
		public static void main(String[] args)
		{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pincode =");
		int a=sc.nextInt();
		
		if(a==834001)
		{
			String name="Ranchi,Jharkhand";
			System.out.println("The location name=  "+name);
		}
		if(a==834002)
		{
			String name="lOCATION 2";
			System.out.println("The location name=  "+name);
		}
		if(a==834003)
		{
			String name="LOCATION 3";
			System.out.println("The location name=  "+name);
		}
		if(a==834004)
		{
			String name="LOCATION 4";
			System.out.println("The location name=  "+name);
		}
	}
		
}