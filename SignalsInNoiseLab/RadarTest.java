

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    @Test
    public void testMonsterLocation()
    {
       Radar radar =  new Radar(100,100);
       radar.setMonsterLocation(0,0);
       int x =0;
       while( x < 100)
       {
           radar.scan();
           x++;
       }
       
       int biggestrow = 0;
       int biggestcol = 0;
       int biggest = 0;
       
       for(int i = 0; i < 100; i++)
       {
           for(int j = 0; j< 100; j++)
           {
               if (radar.getAccumulatedDetection(i,j) > biggest)
               {
                   biggest = radar.getAccumulatedDetection(i,j);
                   biggestrow = i;
                   biggestcol = j;
               }
           }
       }
       assertEquals(0,biggestrow);
       assertEquals(0,biggestcol);
       
    }
    
    /**
     * test if this works
     */
    @Test
    public void testMonsterLocation2()
    {
       Radar radar =  new Radar(100,100);
       radar.setMonsterLocation(5,0);
       int x =0;
       while( x < 100)
       {
           radar.scan();
           x++;
       }
       
       int biggestrow = 0;
       int biggestcol = 0;
       int biggest = 0;
       
       for(int i = 0; i < 100; i++)
       {
           for(int j = 0; j< 100; j++)
           {
               if (radar.getAccumulatedDetection(i,j) > biggest)
               {
                   biggest = radar.getAccumulatedDetection(i,j);
                   biggestrow = i;
                   biggestcol = j;
               }
           }
       }
       assertEquals(5,biggestrow);
       assertEquals(0,biggestcol);
       
    }
}
