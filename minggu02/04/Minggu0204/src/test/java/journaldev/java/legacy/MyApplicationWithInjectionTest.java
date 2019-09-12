/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journaldev.java.legacy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author achmadi
 */
public class MyApplicationWithInjectionTest {
    
    public MyApplicationWithInjectionTest() {
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
     * Test of processMessages method, of class MyApplicationWithInjection.
     */
    @Test
    public void testProcessMessages() {
        System.out.println("processMessages");
        String msg = "";
        String rec = "";
        MyApplicationWithInjection instance = null;
        instance.processMessages(msg, rec);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
