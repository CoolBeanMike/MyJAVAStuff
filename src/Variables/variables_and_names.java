package Variables;

/**
 * Created by mbova on 9/17/2016.
 */
public class variables_and_names
{
	public static void main(String[] args)
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;

		cars = 100;
		space_in_a_car = 4.0f;
		drivers = 30;
		passengers = 90;
		cars_not_driven = cars - drivers;
		cars_driven = drivers;
		carpool_capacity = cars_driven * space_in_a_car;
		average_passengers_per_car = (passengers / cars_driven);

		System.out.println("There are " +cars+ " cars available.");
		System.out.println("There are only " +drivers+ " available.");
		System.out.println("There will be " +cars_not_driven+ " not driven today.");
		System.out.println("We can transport " +carpool_capacity+ "people today.");
		System.out.println("We have " +passengers+ " people to carpool today.");
		System.out.println("We need to put about " +average_passengers_per_car+ " people in each car");
	}
}