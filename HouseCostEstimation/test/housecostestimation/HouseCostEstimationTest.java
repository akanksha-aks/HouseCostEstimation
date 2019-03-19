/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housecostestimation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class HouseCostEstimationTest {
    
    public HouseCostEstimationTest() {
        HouseCostEstimation instance = new HouseCostEstimation();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of HouseCostEstimation method, of class HouseCostEstimation.
     */
    @Test
    public void testHouseCostEstimation() {
        //test cases for standard material
        HouseCostEstimation instance = new HouseCostEstimation();
        assertEquals("your answer is wrong",960000,instance.HouseCostEstimation(1,800),0.0) ;
        assertEquals("your answer is wrong",511200,instance.HouseCostEstimation(1,426),0.0) ;
        //test cases for above standard
        assertEquals("your answer is wrong",874500,instance.HouseCostEstimation(2,583),0.0) ;
        assertEquals("your answer is wrong",677850,instance.HouseCostEstimation(2,451.9),0.0) ;
        //test cases or high standards
        assertEquals("your answer is wrong",900000,instance.HouseCostEstimation(3,500),0.0) ;
        assertEquals("your answer is wrong",1710450,instance.HouseCostEstimation(3,950.25),0.0) ;
        //test cases for high standards and fully automated
        assertEquals("your answer is wrong",1072500,instance.HouseCostEstimation(4,429),0.0) ;
        
    }
}