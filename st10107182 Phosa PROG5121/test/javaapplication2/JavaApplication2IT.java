/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ST10107182
 */
public class JavaApplication2IT {
    
    public JavaApplication2IT() {
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
     * Test of main method, of class JavaApplication2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaApplication2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadArray method, of class JavaApplication2.
     */
    @Test
    public void testLoadArray() {
        System.out.println("loadArray");
        JavaApplication2.loadArray();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class JavaApplication2.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        JavaApplication2.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayDone method, of class JavaApplication2.
     */
    @Test
    public void testDisplayDone() {
        System.out.println("displayDone");
        String expResult = "";
        String result = JavaApplication2.displayDone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of displayLongestDuration method, of class JavaApplication2.
     */
    @Test
    public void testDisplayLongestDuration() {
        System.out.println("displayLongestDuration");
        String expResult = "";
        String result = JavaApplication2.displayLongestDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class JavaApplication2.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String name = "";
        String expResult = "";
        String result = JavaApplication2.search(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class JavaApplication2.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String expResult = "";
        String result = JavaApplication2.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAll method, of class JavaApplication2.
     */
    @Test
    public void testDisplayAll() {
        System.out.println("displayAll");
        JavaApplication2 instance = new JavaApplication2();
        instance.displayAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class JavaApplication2.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskStatus = "";
        String taskId = "";
        String taskName = "";
        int taskDuration = 0;
        String developerDetails = "";
        JavaApplication2 instance = new JavaApplication2();
        String expResult = "";
        String result = instance.printTaskDetails(taskStatus, taskId, taskName, taskDuration, developerDetails);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
