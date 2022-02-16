package day5_core_programs;
import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		int heads=0;
		int tails=0;
		int counter=1;
		double randomNumber=0.0;
		Scanner sc= new Scanner(System.in);
		System.out.println("How Many times the coin will be flipped");
		int flips=sc.nextInt();
		while(counter<=flips) {
			randomNumber=Math.random();
			System.out.println(counter + "\t"+randomNumber);
			if (randomNumber<.5) {
				heads++;
				System.out.println("\t heads");
			}
			else {
				tails++;
				System.out.println("\t tails");
				
			}
			counter++;
		}
		System.out.println("No.of heads ="+heads);
		System.out.println("No.of tails ="+tails);

	}

}
