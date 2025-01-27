package bmi;
import javax.swing.JOptionPane;

/*
   This program demonstrates using dialogs
   with JOptionPane.
*/
 
public class Pane
{
   public static void main(String[] args)
   {
      String height;
      String weight;

      // Prompt the user for their weight in lbs
      weight = JOptionPane.showInputDialog("What is your weight (lbs)?");

      height = JOptionPane.showInputDialog("What is your height in feet and inches (separated by a space)?");
      double feet = Double.parseDouble(height.split(" ")[0]);
      double inches = Double.parseDouble(height.split(" ")[1]);

      double heightInInches = (feet * 12) + inches;
      double heightInMeters = heightInInches * 0.0254;

      double weightInKilograms = Double.parseDouble(weight) * 0.453592;

      double bmi = weightInKilograms / (heightInMeters * heightInMeters);

      // Display a greeting
      JOptionPane.showMessageDialog(null, "Your BMI is: " + bmi);
      System.exit(0);
   }
}
