package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinaryTests {
    int[] intArray;
    //TODO: add tests here
    @Before
    public void init(){
        intArray = new int[] {3,4,5,6,7,8,9};
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void findSixReturnsThree() {
        int returnValue = BonusBinarySearch.binarySearch(intArray, 6);
        assertEquals(returnValue,3);
    }

    @Test
    public void findTwoReturnsNegOne() {
        int returnValue = BonusBinarySearch.binarySearch(intArray, 2);
        assertEquals(returnValue, -1);
    }

    @Test
    public void findThreeReturnsZero() {
        int returnValue = BonusBinarySearch.binarySearch(intArray, 3);
        assertEquals(returnValue, 0);
    }

    @Test
    public void findFourReturnsOne() {
        int returnValue = BonusBinarySearch.binarySearch(intArray, 4);
        assertEquals(returnValue, 1);
    }

}
