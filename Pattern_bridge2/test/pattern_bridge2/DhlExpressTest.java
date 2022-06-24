/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_bridge2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOSE MERIDA ROCA
 */
public class DhlExpressTest {
    
    public DhlExpressTest() {
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
     * Test of precioEmpresa method, of class DhlExpress.
     */
    @Test
    public void testPrecioEmpresa() {
        System.out.println("precioEmpresa");
        float valor = (float)0.0;
        DhlExpress instance = new DhlExpress();
        float expResult = 0.0F;
        float result = instance.precioEmpresa(valor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
