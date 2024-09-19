  
import java.util.Scanner;
import java.util.*;
public class Main {
	public static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
	
		//BankAccount--------------------------------------------
		
       BankAccount acct1 = new BankAccount(1000,-1000, "Bob");
       BankAccount acct2 = new BankAccount(1000,-1000,"Lisa");
       
       System.out.println("your balance:");
       System.out.println(acct1.getBalance());
       System.out.println(acct2.getBalance());
       
       acct1.transfer(acct2, 500);
       
       System.out.println("after transfer 1:");
       System.out.println(acct1.getBalance());
       System.out.println(acct2.getBalance());
       
       System.out.println("after transfer 2:");
       boolean check=acct1.transfer(acct2, 1600);
       if (check==false) {
    	   System.out.println("you tried to transfer more money than you have so you cant transfer this amount of money");
       }   
     
       System.out.println(acct1.getBalance());
       System.out.println(acct2.getBalance());
       
       
       //Rectangle--------------------------
       System.out.println("enter the len of the first rectangle");
       int length1=reader.nextInt();
       System.out.println("enter the width of the first rectangle");
       int width1=reader.nextInt();
       Rectangle rec1=new Rectangle(length1,width1);
       
       System.out.println("enter the len of the second rectangle");
       int length2=reader.nextInt();
       System.out.println("enter the width of the second rectangle");
       int width2=reader.nextInt();
       Rectangle rec2=new Rectangle(length2,width2);
       
       
       rec1.draw();
       System.out.println();
       rec2.draw();
       
       rec1.scale(2);
     
       int area_rec1=rec1.calcArea();
       int area_rec2=rec2.calcArea();
       int sum_area=area_rec1+area_rec2;
       System.out.println("sum of the areas: "+ sum_area);
     
       int perimeter_rec1=rec1.calcPerimeter();
       int perimeter_rec2=rec2.calcPerimeter();
       int sum_perimeter=perimeter_rec1+perimeter_rec2;
       System.out.println("sum of perimeters: "+ sum_perimeter);
       
       
       
       
       }
}
  }

