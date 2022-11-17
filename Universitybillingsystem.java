package Fourthcoursework;
import java.util.*;
public class Universitybillingsystem {

	public static void main(String[] args) {
	  

		// This program is to enable the university to handle the payment system digitally/electronically.
		 Scanner sc = new Scanner(System.in);	
	int number =1134678674, number2= 453231180;	 
String f_name;
String l_name;
int age;
String Course_of_study;
int Year_of_study;
float amount;
String invoices;
String Reg_number;
System.out.print("Please Enter your first Name:");
f_name = sc.nextLine();
System.out.print("Please Enter your Last Name:");
l_name = sc.nextLine();
System.out.print("Please How Old are you?");
age= sc.nextInt();
System.out.print("Please Enter your programme:");
Course_of_study = sc.next();
System.out.print("Enter Your study year:");
Year_of_study= sc.nextInt();
System.out.print("Enter Your current semester:");
Year_of_study= sc.nextInt();
System.out.print("Enter your Registration Number;");
Reg_number = sc.next();

System.out.print("Would you like to pay all of your pending invoices?\n Enter yes or No");
invoices = sc.next();
if(invoices.equals("yes")) {
	System.out.println("Generate Payment Reference Number.");
	System.out.print("Place here to make your payments........:\n");
	System.out.print("Your payment reference is \n" +number);
	System.out.print("Thank you for choosing us!");
}else {
	System.out.print("How much did you like to pay?\n");	

	
System.out.print("Please enter the amount here");
amount = sc.nextFloat();
if(amount <=10000) {
	System.out.print("Please increase the amount");
	amount= sc.nextFloat();
}else {
	System.out.print("Generate payment Reference Number:\nPlace here to generate the number ");
	System.out.print("Your payment refence is\t" +number2);
}}


	}}


