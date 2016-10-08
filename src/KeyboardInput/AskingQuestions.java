package KeyboardInput;
import java.util.Scanner;
/**
 * Created by mbova on 9/23/2016.
 */

public class AskingQuestions
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int feet;
		int inches;
		double weight;

		System.out.println("How old are you? ");
		age = keyboard.nextInt();

		System.out.println("How tall are you, please enter your height in feet and then inches below");
		System.out.println("What is your height in feet ");
		feet = keyboard.nextInt();
		System.out.print("Please enter how many inches ");
		inches = keyboard.nextInt();

		System.out.println("How much do you weight ");
		weight = keyboard.nextDouble();

		System.out.println("So you're "+age+" years old, " +feet+" feet "+inches+" inches tall, and " +weight+ " lbs");
	}
}