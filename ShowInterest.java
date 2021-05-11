 import java.util.Scanner;
import java.util.Locale;
public class ShowInterest
{
     public static void main(String[] args)
     {
         output();
     }
     public static void output()
     {
         title();
         Scanner kb = new Scanner(System.in);
         int times = ask(kb, "\nHow many times do you want to use the app? ");
         for(int i=1;i<=times;i++)
         {
             run();
         }
     }
     public static void run()
     {
         Scanner kb = new Scanner(System.in);
         System.out.print("First and Last Name separated by space: ");
         String name = kb.nextLine();
         int spaceloc = name.indexOf(" ");
         String first = name.substring(0,spaceloc);
         String last = name.substring(spaceloc+1);
         name = first+" "+last;
         System.out.print("Phone number as \"123 456 7890\": ");
         String no = kb.nextLine();
         no = no.substring(0,3) + "-" + no.substring(4,7) + "-" + no.substring(8,12);
         System.out.print("Address as \"6000 J Street:Sacramento:CA 95819\": ");
         String add = kb.nextLine();
         int colonloc = add.indexOf(":");
			String street = add.substring(0, colonloc);
			add = add.substring(colonloc + 1);
			colonloc = add.indexOf(":");
			String city = add.substring(0, colonloc);
			String stateZip = add.substring(colonloc+ 1);
         System.out.println();
         System.out.println();
         lines();
         System.out.println();
         System.out.println("Name: " + name);
         System.out.println("Phone: " + no);
         System.out.println("Address: " + street + "\n\t\t " + city + "\n\t\t " + stateZip);
         System.out.println();
         lines();
         System.out.print("\nInital Amount: ");
         double amt = kb.nextDouble();
         System.out.print("Number of Years: ");
         double yrs = kb.nextDouble();
         System.out.print("Interest rate, \"1.25\" is 1.25%: ");
         double rate = kb.nextDouble();
         System.out.print("Enter the monthly deposit: ");  
         double deposit = kb.nextDouble(); 
         System.out.println();
         table(amt,yrs,rate,deposit);
     }
     public static void lines()
     {
         for(int i=0;i<40;i++)
         {
            System.out.print("*");
         }
     }
     public static void title()
     {
         for(int i=1;i<=15;i++)
         {
             System.out.print("*");
         }
         System.out.print("WELCOME TO INTEREST CALCULATOR WEBSITE");
         for(int i=1;i<=27;i++)
         {
             System.out.print("*");
         }
         System.out.println();
         System.out.println("\nProgram to show how money increases over time given a particular interest");
         System.out.println("rate and a regular deposit amount.");
         System.out.println();
         System.out.println();
         for(int i=0;i<=79;i++)
         {
             System.out.print("*");
         }
     }
     public static int ask(Scanner kb, String num)
     {
         System.out.print(num);
         int no = kb.nextInt();
         kb.nextLine();
         return no;
     }
     /*public static double year(double yrs)
     {
         System.out.println(yrs);
         return yrs;
     }*/
     public static double interest(double rate, double amt)
     {
         double newrate= amt*rate/100;
         //System.out.println(newrate);
         //newrate = Math.round(newrate/100.0)/100.0;
         return newrate;
     }
     public static double deposit(double deposit)
     {
         //System.out.println(deposit);
         return deposit;
     }
     /*public static double NewBalance(double amt, double deposit, double )
     {
         double newbalance = amt+newrate+deposit;
         //System.out.println(newbalance);
         //newbalance = Math.round(newbalance/100.0)/100.0;
         return newbalance;
     }*/
     public static double round(double n)
     {
			n = Math.round(n*100.0)/100.0;
			return n;
	  }
     public static void table(double amt, double yrs, double rate, double deposit)
     {
         System.out.println("Year\tInterest    \t  Deposit    \t  New Balance");
         System.out.printf("start%20d"+amt);
         for(int i=1;i<=yrs;i++)
         {
             //double yrs2 = year(yrs);
             //System.out.println(yrs2);
             double interest2 = interest(rate,amt);
             //System.out.println(interest2);
             double newrate = round(interest2);
             double deposit2 = deposit(deposit);
             //System.out.println(deposit2);
             double newbalance = amt+newrate+deposit;
             double NewBalance2 = round(newbalance);
             amt = NewBalance2;
             //System.out.println(NewBalance2);
             System.out.println(i+"\t"+ newrate + "    \t  " + deposit2 + "    \t    " + NewBalance2); 	
         }
     }
}