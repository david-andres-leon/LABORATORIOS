

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebafinal.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class prueba2
{
    /**
     * Default constructor for test class pruebafinal
     */
    public prueba2()
    {
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
    @Test
    public void CityHeores2()
    {
        CityOfHeroes cityOfHe2 = new CityOfHeroes(500, 500);
        cityOfHe2.makeVisible();
        Canvas canvas = Canvas.getCanvas1();
        cityOfHe2.addBuilding(0, 100, 100, 1);
        cityOfHe2.addBuilding(300, 100, 400, 1);
        canvas.wait(1000);
        cityOfHe2.addBuilding(200, 50, 30, 1);
        canvas.wait(1000);
        cityOfHe2.addHeroe("red", 1, 30);
        canvas.wait(1000);
        // cityOfHe2.jumpPlan("red",2);
        cityOfHe2.jump("red",2);
        canvas.wait(1000);
        //cityOfHe2.jump("red",60,30,false);
    }
}
