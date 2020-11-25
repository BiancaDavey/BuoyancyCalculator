/**
    The InsufficientBuoyancyException class extends the Exception class.
*/

public class InsufficientBuoyancyException extends Exception {
    
    /**
        The InsufficientBuoyancyException constructor passes a message to the superclass calling it if thrown.
    */

    public InsufficientBuoyancyException() {
        super("Maximum passengers exceeded.");
    }
    
}
