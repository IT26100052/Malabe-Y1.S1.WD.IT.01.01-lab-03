import java.util.Scanner;

public class IT26100052Lab3Q3 {
 public static void main(String[] args) {
	 
	 //Declare the variables
	 int amount = 0;
	 
	 int count5000 = 0;
	 int count1000 = 0;
	 int count500 = 0;
	 int count200 = 0;
	 int count100 = 0;
	 int count50 = 0;
	 int count20 = 0;
	 int count10 = 0;
	 int count5 = 0;
	 int count2 = 0;
	 int count1 = 0;
	 
	  //Create a scanner object to read input
	 Scanner input = new Scanner(System.in);
	 
	 //Input the rupee amount
	 System.out.print("Enter the Rupee amount: ");
	 amount = input.nextInt();  //if amount entered is 2754
	 
	 //calculate the number of 5000 rupee notes
	 count5000 = amount /5000; //count 5000 :(2754/5000 =0.55 =0) = 0
	 amount = amount % 5000; //amount ; (2754%5000 = 2754)
	 //modulus rule
	 
	 //calculate the number of 1000 rupee notes
	 count5000 = amount /1000; 
	 amount = amount % 1000;
	 
	 //calculate the number of 500 rupee notes
	 count5000 = amount /500;
	 amount = amount % 500;
	 
	 //calculate the number of 200 rupee notes
	 count5000 = amount /200;
	 amount = amount % 200;
	 
	 //calculate the number of 100 rupee notes
	 count5000 = amount /100; 
	 amount = amount % 100;
	 
	 //calculate the number of 50 rupee notes
	 count5000 = amount /50; 
	 amount = amount % 50;
	 
	 //calculate the number of 20 rupee notes
	 count5000 = amount /20; 
	 amount = amount % 20;
	 
	 //calculate the number of 10 rupee notes
	 count5000 = amount /10; 
	 amount = amount % 10;
	 
	 //calculate the number of 5 rupee notes
	 count5000 = amount /5; 
	 amount = amount % 5;
	 
	 //calculate the number of 2 rupee notes
	 count5000 = amount /2;
	 amount = amount % 2;
	 
	 //calculate the number of 1 rupee notes
	 count5000 = amount /1; 
	 amount = amount % 1;
	 
	 //Print the results
	 System.out.println();
	 System.out.print("5000 Notes - "+ count5000);
	 System.out.print("1000 Notes - "+ count1000);
	 System.out.print("500 Notes - "+ count500);
	 System.out.print("200 Notes - "+ count200);
	 System.out.print("100 Notes - "+ count100);
	 System.out.print("50 Notes - "+ count50);
	 System.out.print("20 Notes - "+ count20);
	 System.out.print("10 Notes - "+ count10);
	 System.out.print("5 Notes - "+ count5);
	 System.out.print("2 Notes - "+ count2);
	 System.out.print("1 Notes - "+ count1);

 }
}