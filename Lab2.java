package lab2;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;

class Lab2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int firstYear, firstMonth, firstDay, secondYear, secondMonth, secondDay;

		

		System.out.print("Enter year of your first date: "); //First date user input

		firstYear = sc.nextInt();

		System.out.print("Enter month of your first date: ");

		firstMonth = sc.nextInt();

		System.out.print("Enter day of your first date: ");

		firstDay = sc.nextInt();

		 

		

		System.out.print("Enter year of your second date: "); //Second date user input

		secondYear = sc.nextInt();

		System.out.print("Enter month of your second date: ");

		secondMonth = sc.nextInt();

		System.out.print("Enter day of your second date: ");

		secondDay = sc.nextInt();

		 
		

		LocalDate date1 = LocalDate.of(firstYear, firstMonth, firstDay); //Using LocalDate class to covert user dates

		LocalDate date2 = LocalDate.of(secondYear, secondMonth, secondMonth);

	
		

		System.out.print("The number of days in between is:  ");

		long days = ChronoUnit.DAYS.between(date1, date2); //Returning the difference between two dates

		if(days < 0)

		days = days*-1;


		System.out.println(days);

		}

	
}
