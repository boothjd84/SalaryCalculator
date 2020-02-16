import java.util.Scanner;
import  javax.swing.JOptionPane;
//=====================
//Illustration of simple arithmetic in Java
//Author: Jonathan Booth
//Written: 08/30/2012
//=====================
public class Calc {
public static void main(String[] args){
  	System.out.println("\nFirst Prog. \n");
  		double payRate = 6.5;
  		double annualSalary;
  		
  		annualSalary = payRate * 40 * 52;
  		
  		System.out.println("\nYou made $" + payRate + "per hour which is $" + annualSalary + " per year\n");
		Scanner keyboard = new Scanner(System.in);
	  	String name  = keyboard.next();
	  	System.out.println(name);
	  
	  	name = JOptionPane.showInputDialog("Enter your name:"); 
	  	System.out.println(name);
	  	JOptionPane.showMessageDialog(null,  "Your name is " + name);
	}
}
