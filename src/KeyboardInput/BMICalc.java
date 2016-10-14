package KeyboardInput;
import java.util.Scanner;

/**
 * Created by mbova on 10/8/2016.
 */
public class BMICalc
{
	public static void main(String[] arg)
	{
		int height, weight;
		double bmi, heightM, weightKG;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in inches");
		height = keyboard.nextInt();
		System.out.println("What is your weight in lb");
		weight = keyboard.nextInt();
		weightKG = (weight *0.453592);
		heightM = (height * 0.0254);
		bmi = weightKG / (heightM * heightM);
		System.out.println("Your BMI is: " +bmi);
	}
}