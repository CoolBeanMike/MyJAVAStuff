package If_else;

/**
 * Created by mbova on 10/8/2016.
 */
public class what_if
{
	public static void main(String[] arg)
	{
		int people = 20;
		int cats = 30;
		int dogs = 15;

		if (people < cats)
		{
			System.out.println("Too many cats! We are all doomed!");
		}


		if (people > cats)
		{
			System.out.println("Not so many cats, the world is fine");
		}

		if (people <= dogs)
		{
			System.out.println("The world is drooled on ");
		}

		if (people > dogs)
		{
			System.out.println("The world is OK");
		}

		dogs += 5;

		if (people >= dogs)
		{
			System.out.println("People are greater or equal to dogs");
		}

		if (people <= dogs)
		{
			System.out.println("People are less than or equal to dogs");
		}

		if (people == dogs)
			System.out.println("people are == to dogs");
			cats +=5;

		System.out.println("Cats = "+cats);

	}
}