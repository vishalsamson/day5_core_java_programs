package day5_core_programs;
import java.util.Scanner;
public class LeapYearCheck {

	public static void main(String[] args) {
		System.out.println("Enter a Four Digit Year\n");
		Scanner sc= new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("Year is a leap year");
				}
				else {
					System.out.println("Year is a leap year");
				}
			}
			else {
				System.out.println("Year is a leap year");
			}
		}
		else {
			System.out.println("Year is not leap year");
		}
		

	}

}
