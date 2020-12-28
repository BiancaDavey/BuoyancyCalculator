import java.util.Scanner;

public class BoatUser {

    /**
     * This class enables the creation of Boat objects through prompting user input.
     * The castAway method is applied to the Boat object created by the user to calculate the buoyancy.
     */

    private static final int MIN_PASSENGERS = 36;  // The castAway method will be called with the passenger number being 36.
    public static void main(String[] args) throws Exception{
     
        System.out.print("Boat\n");  
        try {
            Scanner keyboard = new Scanner (System.in);
            System.out.println("Enter the width of the boat: ");
            double width = keyboard.nextDouble();
            System.out.println("Enter the length of the boat: ");
            double length = keyboard.nextDouble();
            System.out.println("Enter the height of the boat: ");
            double height = keyboard.nextDouble();

            Boat newBoat = new Boat(width, length, height);
            newBoat.calculateBuoyancy(MIN_PASSENGERS);
            System.out.println("The boat cast away with " + MIN_PASSENGERS + " passengers.");
        } catch (IllegalArgumentException e) {
            System.out.println("The boat could not cast away: " + e.getMessage());
        } catch (InsufficientBuoyancyException e) {
            System.out.println("The boat has sunk: " + e.getMessage());
        }
    }

}