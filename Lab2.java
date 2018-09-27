package lab2;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;

class Lab2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int year1, month1, day1, year2, month2, day2;

		

		System.out.print("Enter year of your first date: "); //First date user input

		year1 = sc.nextInt();

		System.out.print("Enter month of your first date: ");

		month1 = sc.nextInt();

		System.out.print("Enter day of your first date: ");

		day1 = sc.nextInt();

		 

		

		System.out.print("Enter year of your second date: "); //Second date user input

		year2 = sc.nextInt();

		System.out.print("Enter month of your second date: ");

		month2 = sc.nextInt();

		System.out.print("Enter day of your second date: ");

		day2 = sc.nextInt();

		 
		

		LocalDate date1 = LocalDate.of(year1, month1, day1); //Using LocalDate class to covert user dates

		LocalDate date2 = LocalDate.of(year2, month2, day2);

	
		

		System.out.print("The number of days in between is:  ");

		long days = ChronoUnit.DAYS.between(date1, date2); //Returning the difference between two dates

		if(days < 0)

		days = days*-1;


		System.out.println(days);

		}

	
}
