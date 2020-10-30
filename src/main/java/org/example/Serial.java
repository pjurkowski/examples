package org.example;

/**
 * Serial is a array containing digits that are components of really big number.
 */
public class Serial {

    private int[] current = {0};

    /**
     * Increment current number by one.
     * Example current {7,9} after increment {8,0}
     * @return incremented number
     */
    public int[] increment(){
        return current;
    }
}
