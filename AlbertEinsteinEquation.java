import java.util.Scanner;
/**
 * This Log Company program shows user how many logs can fit in a truck
 * based on the length of each log.
 *
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-02-13 
 */

public class AlbertEinsteinEquation {
  //variables
  static double massOfObject;
  
  /**
   * Inputs and calculates energy of mass in joules.
   */

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
    //Ask user for mass of an object in kilograms
    System.out.print("Enter the mass of an object in kilograms: ");
    massOfObject = input.nextDouble();

    //Calculates energy in joules if the number is greater or equal to 0
    if (massOfObject >= 0) {
      double joules = massOfObject * (Math.pow(299800000,2));
      double kilotonBomb = (joules / 1.0e12) / 4.2;
   
      //Shows energy of mass in joules
      System.out.println("If mass was converted, it would produce " + joules + "J of energy.");  
    
      System.out.println("Or this would be the equivalent of a " + kilotonBomb + " kiloton bomb");  
   
   
      //If number is invalid  
    } else {
      System.out.println("Please enter a number equal or greater than 0.");  

    }
  }
}