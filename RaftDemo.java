/** 
 Demo class for Raft class, 
 Assignment 4, COSC120
 Dr Edmund Sadgrove, UNE, Australia
*/

public class RaftDemo {
   private static final int MIN_PASSENGERS = 36;
   public static void main(String[] args) throws Exception{
        // Initialize raft prototypes with dimensions in metres  
        // Attempt to cast away with 36 passengers on board.
		
        System.out.print("Prototype One: ");
        try{
            Raft prototypeOne = new Raft(-1.0,2.0,1.0);
            prototypeOne.castAway(MIN_PASSENGERS);
            // The following statement should not execute.
            System.out.println("The raft cast away with " + MIN_PASSENGERS + " passegers.");
        } catch (IllegalArgumentException e) {
            // This section should execute.
            System.out.println("Could not cast away: " + e.getMessage());
        } catch (InsufficientBuoyancyException e) {
            System.out.println("The Raft has sunk: " + e.getMessage());
        }
		
        System.out.print("Prototype Two: ");
        try{
            Raft prototypeTwo = new Raft(5.0,0.3,5.0);
            prototypeTwo.castAway(MIN_PASSENGERS);
            // The following statement should not execute.
            System.out.println("The raft cast away with " + MIN_PASSENGERS + " passegers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Could not cast away: " + e.getMessage());
        } catch (InsufficientBuoyancyException e) {
            // This section should execute.
            System.out.println("The raft has sunk: " + e.getMessage());
        }
		
        System.out.print("Prototype Three: ");
        try{
            Raft prototypeThree = new Raft(10.0,0.5,10.0);
            prototypeThree.castAway(MIN_PASSENGERS);
            // This section should execute.
            System.out.println("The raft cast away with " + MIN_PASSENGERS + " passengers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Could not cast away: " + e.getMessage());
        } catch (InsufficientBuoyancyException e) {
            System.out.println("The raft has sunk: " + e.getMessage());
        }
   }
}
