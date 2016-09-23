package com.company;

import static java.lang.Math.round;

/**
 * Created by mbova on 9/17/2016.
 */
public class MoreVariablesAndPrinting {
	public static void main(String[] args) {
		String myName, myEyes, units, myTeeth, myHair;
		int myAge, myHeight, myWeight;

		myName = "Cool Bean Mike";
		myAge = 30;
		myWeight = 170;
		myHeight = 74;
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		units = "pounds";

		System.out.println("Lets talk about " + myName + ".");
		System.out.println("He's " + myHeight + " tall");
		System.out.println("He's " + myWeight + " " + units + " ");
		System.out.println("Actually that is not that heavy");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair");
		System.out.println("His teeth are usualy " + myTeeth + " depending on the coffee");
		System.out.println("If I add " + myAge + ", " + myWeight + ", and " + myHeight + " I should get " + round(+myAge +
				myWeight + myHeight) + ".");
		System.out.println("cool bean 1,2,3 " + (1 + 2 + 3));

	}
}