import java.util.Scanner;
/*this class gets the information of the user like name, phone number and address. Then
it calculates the interest and returns it. There is a method which rounds up to two figures*/
public class ShowInterestHelper
{
    Scanner kb = new Scanner(System.in);
    /*this method gets the information of the user, then prints the last name
     first and first name last and converts the whole name to uppercase*/
    public static String getName(Scanner kb) 
    {
			System.out.print("First and Last Name separated by space: ");
			String name = kb.nextLine();
        // kb.nextLine();
			int spaceLocation = name.indexOf(" "); 
			String last = name.substring(spaceLocation + 1);
			String first = name.substring(0,spaceLocation);
			return last.toUpperCase() + " " + first.toUpperCase();
	 }
    /*the method getTelephone() gets the telephone number from the user in the form of 
      123 456 7890 and then adds - wherever it finds space, for example 123-456-7890*/
    public static String getTelephone(Scanner kb)
    {
         System.out.print("Phone number as \"123 456 7890\": ");
         String no = kb.nextLine();
        // kb.nextLine();
         no = no.substring(0,3) + "-" + no.substring(4,7) + "-" + no.substring(8,12);
         return no;
    }
    /* this method asks the user for the address in the form of 6000 j Street:Sacramento:CA 95819
    and then starts a new line whenever it reads :*/
    public static String getAddress(Scanner kb)
    {
         System.out.print("Address as \"6000 J Street:Sacramento:CA 95819\": ");
         String add = kb.nextLine();
        // kb.nextLine();
         int colonloc = add.indexOf(":");
			String street = add.substring(0, colonloc);
			add = add.substring(colonloc + 1);
			colonloc = add.indexOf(":");
			String city = add.substring(0, colonloc);
			String stateZip = add.substring(colonloc+ 1);
         return street + "\n\t" + city + "\n\t" + stateZip;
    }
    /* the below program gets the interest from the amount and rate entered by the user and then retuens the interest*/
    public static double getInterest(double amount, double rate) 
    {
         double newrate= amount*rate/100;
         return newrate;
    }
    /*this method rounds up to two value of whatever value is passed and returns it back*/
    public static double round2(double n)
    {
         n = Math.round(n*100.0)/100.0;
			return n;
    }
}