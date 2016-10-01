//Name: Kyle Moore
//UFL ID: 2977-6819
//Section: 1146
//Project Number: 2
//A program that takes user input to calculate shape-based formulas.

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ShapeMachine {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		//had to create an extra scanner b/c the nextLine command at the beginning of the while loop was registering a blank space after the inputs for sides of shapes
		Scanner input1 = new Scanner(System.in);	
		String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		int x = 0;
		int y = 0;
		String userDay = "";
		String userMonth = "";
		String userYear = "";
		String userDMY = "";
		System.out.println("Shape Machine Login");
		//while loop for 3 attempts
		while (y!=3)
		{
		System.out.println("");
		System.out.println("What is today's day? ");
		 userDay = input.nextLine();
		System.out.println("What is today's month? ");
		 userMonth = input.nextLine();
		System.out.println("What is today's year? ");
		 userYear = input.nextLine();
		userDMY = (userDay + "-" + userMonth + "-" + userYear);
		if (userDMY.equals(date) == true)
			break;
		y++;
		if (y == 3)
		{
			System.out.println("#ERROR 3rd invalid login attempt. Terminating program.");
			System.exit(0);
		}
		System.out.println("#ERROR Login attempt #" + y + " Invalid input. Please try again.");
		//end of while loop
		}	
		
		System.out.println("Correct date. Welcome!");
		System.out.println("");
		String c = "Circles";
		String r = "Rectangles";
		String t = "Triangles";
		String e = "Exit";
		String userChoice = "test";
		
		 while (userChoice.equals(e) != true)
		{

			System.out.println("---Welcome to the Shape Machine---");
			System.out.println("Available Options:");
			System.out.println(c);
			System.out.println(r);
			System.out.println(t);
			System.out.println(e);
			System.out.println("");
			userChoice = input.nextLine();
		
			if ((userChoice.equals(c) != true) && (userChoice.equals(r) != true) && (userChoice.equals(t) != true) && (userChoice.equals(e) != true))
			{
			System.out.println("#ERROR Invalid option. Please try again.");

			}
			
		
		// circle path
		if (userChoice.equals(c))
		{
		System.out.println("Circles selected. Please enter the radius: ");
		String radius = input1.nextLine();
		double radius1 = Double.parseDouble(radius);
	
		while (radius1 < 0)
			{
			System.out.println("#ERROR Negative input. Please input the radius again:");
			radius = input1.nextLine();
			radius1 = Double.parseDouble(radius);
			}
			double circumference = (2 * radius1 * Math.PI);
			double areaCircle =  ( Math.PI * radius1 *radius1);
//			double areaCircle =  ( Math.PI * (Math.pow(radius1, 2)) );
			System.out.println("The circumference is: " + circumference);
			System.out.println("The area is: " + areaCircle);
			//for some reason the area is rounded differently
			String circumferenceDigits = String.valueOf(circumference);
			// gets rid of decimal place so the digits is accurate
			int decimalPlace = circumferenceDigits.indexOf('.');
			String circumferenceDigits1 = circumferenceDigits.substring(0, decimalPlace);
			String circumferenceDigits2 = circumferenceDigits.substring(decimalPlace + 1);
			String circumferenceDigits3 = (circumferenceDigits1 + circumferenceDigits2);
			System.out.println("Total number of digits in the circumference is: " + circumferenceDigits3.length());
			
			String areaCircleDigits = String.valueOf(areaCircle);
			// gets rid of decimal place so the digits is accurate
			int decimalPlaceArea = areaCircleDigits.indexOf('.');
			String areaCircleDigits1 = areaCircleDigits.substring(0, decimalPlaceArea);
			String areaCircleDigits2 = areaCircleDigits.substring(decimalPlaceArea + 1);
			String areaCircleDigits3 = (areaCircleDigits1 + areaCircleDigits2);
			System.out.println("Total number of digits in the area is: " + areaCircleDigits3.length());
			System.out.println("");
		}

		// rectangle path
		if (userChoice.equals(r))
		{
		System.out.println("Rectangles selected. Please enter the 2 sides: ");
		String side1 = input1.next();
		String side2 = input1.next();
		double side1Double = Double.parseDouble(side1);
		double side2Double = Double.parseDouble(side2);
		while ((side1Double < 0) || (side2Double < 0))
				{
					System.out.println("#ERROR Negative input. Please input the 2 sides again: ");
					side1 = input1.next();
					side2 = input1.next();
					side1Double = Double.parseDouble(side1);
					side2Double = Double.parseDouble(side2);
				}
		double areaRect = (side1Double * side2Double);
		double perimeterRect = ((2 * side1Double) + (2 * side2Double));
		System.out.println("The area is: " + areaRect);
		System.out.println("The perimeter is: " + perimeterRect);
		
		String areaRectDigits = String.valueOf(areaRect);
		// gets rid of decimal place so the digits is accurate
		int decimalPlaceAreaRect = areaRectDigits.indexOf('.');
		String areaRectDigits1 = areaRectDigits.substring(0, decimalPlaceAreaRect);
		String areaRectDigits2 = areaRectDigits.substring(decimalPlaceAreaRect + 1);
		String areaRectDigits3 = (areaRectDigits1 + areaRectDigits2);
		System.out.println("Total number of digits in the area is: " + areaRectDigits3.length());
		
		String perimeterRectDigits = String.valueOf(perimeterRect);
		// gets rid of decimal place so the digits is accurate
		int decimalPlacePerimeterRect = perimeterRectDigits.indexOf('.');
		String perimeterRectDigits1 = perimeterRectDigits.substring(0, decimalPlacePerimeterRect);
		String perimeterRectDigits2 = perimeterRectDigits.substring(decimalPlacePerimeterRect + 1);
		String perimeterRectDigits3 = (perimeterRectDigits1 + perimeterRectDigits2);
		System.out.println("Total number of digits in the perimeter is: " + perimeterRectDigits3.length());
		System.out.println("");
		continue;
		}
		//Triangle path
		if (userChoice.equals(t))
		{
		System.out.println("Triangles selected. Please enter the 3 sides: ");
		String side1Tri = input1.next();
		String side2Tri = input1.next();
		String side3Tri = input1.next();
		double side1TriDouble = Double.parseDouble(side1Tri);
		double side2TriDouble = Double.parseDouble(side2Tri);
		double side3TriDouble = Double.parseDouble(side3Tri);
		while  ((side1TriDouble < 0) || (side2TriDouble < 0) || (side3TriDouble < 0))
			{
			System.out.println("#ERROR Negative input. Please input the 3 sides again: ");
			side1Tri = input1.next();
			side2Tri = input1.next();
			side3Tri = input1.next();
			side1TriDouble = Double.parseDouble(side1Tri);
			side2TriDouble = Double.parseDouble(side2Tri);
			side3TriDouble = Double.parseDouble(side3Tri);
			}
		//if triangle is valid
		if (((side1TriDouble + side2TriDouble) > side3TriDouble) && ((side1TriDouble + side3TriDouble) > side2TriDouble) && ((side2TriDouble + side3TriDouble) > side1TriDouble))
				{
					//triangle type
					String triangleType = "";
					if((side1TriDouble == side2TriDouble) && (side1TriDouble == side3TriDouble))
						triangleType = "Equilateral";
					else if ((side1TriDouble == side2TriDouble) || (side1TriDouble == side3TriDouble) || (side2TriDouble == side3TriDouble ))
						triangleType = "Isosceles";
					else
						triangleType = "Scalene";
					System.out.println("The triangle is: " + triangleType);
			
					double perimeterTri = (side1TriDouble + side2TriDouble + side3TriDouble);
					double halfPerimeter = (perimeterTri/2);
					double areaTri = (Math.sqrt((halfPerimeter)*(halfPerimeter-side1TriDouble)*(halfPerimeter-side2TriDouble)*(halfPerimeter-side3TriDouble)));
					System.out.println("The perimeter is: " + perimeterTri);
					System.out.println("The area is: " + areaTri);
					
					
					String perimeterTriDigits = String.valueOf(perimeterTri);
					// gets rid of decimal place so the digits is accurate
					int decimalPlacePerimeterTri = perimeterTriDigits.indexOf('.');
					String perimeterTriDigits1 = perimeterTriDigits.substring(0, decimalPlacePerimeterTri);
					String perimeterTriDigits2 = perimeterTriDigits.substring(decimalPlacePerimeterTri + 1);
					String perimeterTriDigits3 = (perimeterTriDigits1 + perimeterTriDigits2);
					System.out.println("Total number of digits in the perimeter is: " + perimeterTriDigits3.length());
					
					
					
					String areaTriDigits = String.valueOf(areaTri);
					// gets rid of decimal place so the digits is accurate
					int decimalPlaceAreaTri = areaTriDigits.indexOf('.');
					String areaTriDigits1 = areaTriDigits.substring(0, decimalPlaceAreaTri);
					String areaTriDigits2 = areaTriDigits.substring(decimalPlaceAreaTri + 1);
					String areaTriDigits3 = (areaTriDigits1 + areaTriDigits2);
					System.out.println("Total number of digits in the area is: " + areaTriDigits3.length());
					System.out.println("");
				}
		// if triangle is not valid
		else
				{
					System.out.println("#ERROR Triangle is not valid. Returning to menu. ");
					continue;
				}
		}
		//exit
		if (userChoice.equals(e))
		{
		System.out.println("Terminating program. Have a nice day!");
		System.exit(0);
		}
	}
	}
}
