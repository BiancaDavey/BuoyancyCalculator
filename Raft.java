public class Raft {

    /**
        This program takes weight, length and height values and applies a calculation to determine whether a given combination of these values would result in a raft sinking with a given number of passengers.
        @param PW a final integer value representing the density of water per m3.
        @param PC a final integer value representing the density of a coconut tree per m3.
        @param AVERAGE_WEIGHT a final double value representing the average weight of a passenger.
        @param width a double value representing the width measurement.
        @param height a double value representing the height measurement.
        @param length a double value representing the length measurement.

    */

    final int PW = 1030; 
    final int PC = 900;  
    final double AVERAGE_WEIGHT = 75.0; 
    public double width; 
    public double height;
    public double length; 

    /** 
        The Raft constructor accepts width, height, and length arguments and throws an IllegalArgumentException if any of their values are below zero.
    */

    public Raft(double w, double h, double l) throws IllegalArgumentException {
        width = w;
        height = h;
        length = l;
        if ((width < 0) || (height < 0) || (length < 0)) {
            throw new IllegalArgumentException("Attribute less than zero.");
        }
    }

    /*
        The castAway method applies a calculation to determine the volume of the raft and the number of passengers that it can hold before sinking.
        An InsufficientBuoyancyException is thrown if the result of the calculation is less than the MIN_PASSENGERS value.
        @param result a double value representing the result of the calculation applied to the width, height and length values.
    */

    public double castAway(int MIN_PASSENGERS) throws InsufficientBuoyancyException{
        double result;
        result = ((width * height * length)/AVERAGE_WEIGHT) * (PW-PC);
        if (result < MIN_PASSENGERS) {
            throw new InsufficientBuoyancyException();
        }
        return result;
    }

}
