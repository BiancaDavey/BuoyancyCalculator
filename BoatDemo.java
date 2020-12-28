public class BoatDemo {

    /**
    * This class demonstrates the Boat.java class.
    * MIN_PASSENGER set and demonstration calculated by Dr Edmund Sadgrove, University of New England, Armidale, esadgro2@une.edu.au.

    */

   private static final int MIN_PASSENGERS = 36;  // The castAway method will be called with the passenger number being 36.

   public static void main(String[] args) throws Exception{

        System.out.print("Boat One\n");
        try{
            Boat boatExampleOne = new Boat(-1.0,2.0,1.0);
            boatExampleOne.calculateBuoyancy(MIN_PASSENGERS);
            System.out.println("The boat cast away with " + MIN_PASSENGERS + " passengers.");
        } catch (IllegalArgumentException e) {
            System.out.println("The boat could not cast away: " + e.getMessage());
        } catch (InsufficientBuoyancyException e) {
            System.out.println("The boat has sunk: " + e.getMessage());
        }

        System.out.print("Boat Two\n");
        try{
            Boat boatExampleTwo = new Boat(5.0,0.3,5.0);
            boatExampleTwo.calculateBuoyancy(MIN_PASSENGERS);
            System.out.println("The boat cast away with " + MIN_PASSENGERS + " passengers.");
        } catch (IllegalArgumentException e) {
            System.out.println("The boat could not cast away: " + e.getMessage());
        } catch (InsufficientBuoyancyException e) {
            System.out.println("The boat has sunk: " + e.getMessage());
        }
		
        System.out.print("Boat Three\n");
        try{
            Boat boatExampleThree = new Boat(10.0,0.5,10.0);
            boatExampleThree.calculateBuoyancy(MIN_PASSENGERS);
            System.out.println("The boat cast away with " + MIN_PASSENGERS + " passengers.");
        } catch (IllegalArgumentException e) {
            System.out.println("The boat could not cast away: " + e.getMessage());
        } catch (InsufficientBuoyancyException e) {
            System.out.println("The boat has sunk: " + e.getMessage());
        }
   }
}
