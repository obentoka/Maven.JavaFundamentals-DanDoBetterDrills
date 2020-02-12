package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        Boolean isGreaterThan;
        if(x > y){
            isGreaterThan = true;
        }else isGreaterThan = false;
        return isGreaterThan;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        Boolean isLessThan;
        if(x < y){
            isLessThan = true;
        }else isLessThan = false;
        return isLessThan;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        Boolean isGreaterThanEqualTo;
        if(x >= y){
            isGreaterThanEqualTo = true;
        }else isGreaterThanEqualTo = false;
        return isGreaterThanEqualTo;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        Boolean isLessThanEqualTo;
        if(x <= y){
            isLessThanEqualTo = true;
        }else isLessThanEqualTo = false;
        return isLessThanEqualTo;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        return true;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
    }

}