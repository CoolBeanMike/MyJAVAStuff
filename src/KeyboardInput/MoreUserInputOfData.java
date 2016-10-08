package KeyboardInput;
import java.util.Scanner;

/**
 * Created by mbova on 9/28/2016.
 */
public class MoreUserInputOfData
{
	public static void main (String[] args)
	{
		int id, grade;
		double gpa;
		String first, last, login;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your First Name");
		first =keyboard.next();
		System.out.println("What is your last name");
		last = keyboard.next();
		System.out.println("What grade are you in(1, 2..etc...)");
		grade = keyboard.nextInt();
		System.out.println("What is your student ID: ");
		id = keyboard.nextInt();
		System.out.println("What is your GPA: ");
		gpa = keyboard.nextDouble();

		System.out.println("Below is the information which was entered");
		System.out.println("First Name: " +first);
		System.out.println("Grade (9-12)): " +grade);
		System.out.println("Student ID: " +id);
		System.out.println("Your GPA: " +gpa);
	}
}