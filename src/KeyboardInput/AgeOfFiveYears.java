package KeyboardInput;
import java.util.Scanner;

/**
 * Created by mbova on 10/7/2016.
 */

public class AgeOfFiveYears
{

	public static void main(String[] args)
	{
		String name;
		int age, will, was;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name: ");
		name = keyboard.next();
		System.out.println("What is your current age: ");
		age = keyboard.nextInt();
		will = age + 5;
		was = age - 5;
		System.out.println("Your current age is " +age+ " but in 5 years your will be " +will+ " and 5 years " +
				"ago you were " +was);
	}
}