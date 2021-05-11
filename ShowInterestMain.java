/*Hetvi Patel
this programs  shows how money increases over time given a particular interest rate and a regular deposit amount.  
The program is written with parameters so that these values could be changed to compute a different interest rate, 
number of years, starting amount or deposit amount. 
03/05/2020*/
import java.util.Scanner;
import java.util.Locale;
public class ShowInterestMain
{
     /*this main method asks the user how many times he or she wants to run the program*/    
     public static void main(String[] args)
     {
         description();
         Scanner kb = new Scanner(System.in);
         System.out.print("\nHow many times do you want to use the app? ");
         int no = kb.nextInt();
         for(int i=1;i<=no;i++)
         {
             kb.nextLine();
             getInfo(kb);
             getInterest(kb);
         }
     }
     /*this method displays the name, phone number and address which were asked in the ShowInterestHelper class and returned here*/ 
     public static void getInfo(Scanner kb)
     {
         String name, no, add;
         name = ShowInterestHelper.getName(kb);
         no = ShowInterestHelper.getTelephone(kb);
         add = ShowInterestHelper.getAddress(kb);
         System.out.println(); 
         System.out.println();
          for(int i=0;i<40;i++)
         {
            System.out.print("*");
         }
         System.out.println();
         System.out.println("Name: " + name); 
         System.out.println("Phone: " + no);
         System.out.println("Address: " + add);
         System.out.println(); 
         System.out.println();
          for(int i=0;i<40;i++)
         {
            System.out.print("*");
         }
      }
      /*this method asks the user to enter amount, rate, no of years and deposit of thier choice. It also class the method
      printTable*/
      public static void getInterest(Scanner kb)
      {
         System.out.print("\nInital Amount: ");
         double amount = kb.nextDouble();
         System.out.print("Number of Years: ");
         double periods = kb.nextDouble();
         System.out.print("Interest rate, \"1.25\" is 1.25%: ");
         double rate = kb.nextDouble();
         System.out.print("Enter the monthly deposit: ");  
         double deposit = kb.nextDouble(); 
         printTable(amount,periods,rate,deposit);
     }
     /*this method is called in the main method. This method shows the description displayd in the start of the program*/ 
     public static void description()
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
     /*this method does all the main work. It displays the amount, converted rate, deposit and the total balance
     ina tabular form.*/
     public static void printTable(double amount, double periods, double rate, double deposit)
     {
         System.out.println("Year\tInterest    \t  Deposit    \t  New Balance");
         System.out.println("Start\t  \t    \t     \t       \t        \t  "+amount);
         for(int i=1;i<=periods;i++)
         {
             //double yrs2 = year(yrs);
             //System.out.println(yrs2);
             double interest2 = ShowInterestHelper.getInterest(rate,amount);
             //System.out.println(interest2);
             double newrate = ShowInterestHelper.round2(interest2);
             double newbalance = amount+newrate+deposit;
             double NewBalance2 = ShowInterestHelper.round2(newbalance);
             amount = NewBalance2;
             //System.out.println(NewBalance2);
             System.out.println(i+" \t    "+ newrate + "        \t    " + deposit + "      \t     " + NewBalance2); 	
         }
         System.out.println();
     }
}