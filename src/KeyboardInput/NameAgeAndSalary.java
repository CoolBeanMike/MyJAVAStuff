package KeyboardInput;
import java.util.Scanner;


/**
 * Created by mbova on 9/28/2016.
 */

public class NameAgeAndSalary
{
	public static void main (String[] args)
	{
		Scanner Keyboard = new Scanner(System.in);
		String name;
		int age, make;
		System.out.println("What is your name");
		name = Keyboard.next();
		System.out.println("What is your age");
		age = Keyboard.nextInt();
		System.out.println("That is not old, How much do you make "+name);
		make = Keyboard.nextInt();
		System.out.println("So you make "+make+ " That is not bad pay for the work");
	}
}
