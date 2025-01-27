package bmi;
import java.util.Scanner;

public class Console
{
    public static void main(String[] args)
    {
        String height;
        Scanner keyboard = new Scanner(System.in);
        // Prompt the user for their weight in lbs
        System.out.print("Enter your weight in lbs: ");
        // Read the user's weight in lbs
        double weight = keyboard.nextDouble();

        height = keyboard.nextLine();
        // Prompt the user for their height in feet proceeded by a space and inches
        System.out.print("Enter your height in feet and inches (separated by a space): ");
        // Read the user's height in feet and inches
        height = keyboard.nextLine();
        double feet = Double.parseDouble(height.split(" ")[0]);
        double inches = Double.parseDouble(height.split(" ")[1]);

        double heightInInches = (feet * 12) + inches;
        double heightInMeters = heightInInches * 0.0254;

        double weightInKilograms = weight * 0.453592;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is: " + bmi);
    }
}