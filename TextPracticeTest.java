/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;

import java.util.ArrayList;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Deema
 */
public class TextPracticeTest {
    
    public TextPracticeTest() {
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
     * Test of increase_numberOfCorrectCharacters method, of class TextPractice.
     */
    @Test
    public void test1Increase_numberOfCorrectCharacters() {
        System.out.println("increase_numberOfCorrectCharacters");
        int expected = 2;
        TextPractice instance = new TextPractice();
        instance.increase_numberOfCorrectCharacters(2);
        int result = instance.getNumberOfCorrectCharacters();
        assertEquals(expected, result);
    }
    

 
    /**
     * Test of increase_CurrentWord method, of class TextPractice.
     */
    /*@Test
    public void testIncrease_CurrentWord() {
        System.out.println("increase_CurrentWord");
        TextPractice instance = new TextPractice();
        boolean expResult = false;
        boolean result = instance.increase_CurrentWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getCurrentWord method, of class TextPractice.
     */
    @Test
    public void test1GetCurrentWord() {
        System.out.println("getCurrentWord");
        TextPractice instance = new TextPractice();
        instance.setText("String name;");
        String expected = "String";
        instance.setNewLine();
        String result = instance.getCurrentWord();
        assertEquals(expected, result);
       
    }
    @Test
    public void test2GetCurrentWord() {
        System.out.println("getCurrentWord");
        TextPractice instance = new TextPractice();
        instance.setText("int num;");
        String expected = "num;";
        instance.setNewLine();
        instance.increase_CurrentWord();
        String result = instance.getCurrentWord();
        assertEquals(expected, result);
       
    }
    @Test
    public void test3GetCurrentWord() {
        System.out.println("getCurrentWord");
        TextPractice instance = new TextPractice();
        instance.setText("int num1;\nstring firstname;\n");
        instance.setNewLine();
        instance.setNewLine();
        String expected = "string";
        String result = instance.getCurrentWord();
        assertEquals(expected, result);
       
    }
  @Test
    public void test4GetCurrentWord() {
        System.out.println("getCurrentWord");
        TextPractice instance = new TextPractice();
        instance.setText("int num1;\nstring firstname;\n");
        instance.setNewLine();
        instance.setNewLine();
        instance.increase_CurrentWord();
        String expected = "firstname;";
        String result = instance.getCurrentWord();
        assertEquals(expected, result);
       
    }
    @Test // not written in report
    public void test5GetCurrentWord() {
        System.out.println("getCurrentWord");
        TextPractice instance = new TextPractice();
        instance.setText("int num1;\nstring firstname;\n");
        instance.setNewLine();
        instance.increase_CurrentWord();
        String expected = "num1;";
        String result = instance.getCurrentWord();
        assertEquals(expected, result);
       
    }
    @Test // not written in report
    public void test6GetCurrentWord() {
        System.out.println("getCurrentWord");
        TextPractice instance = new TextPractice();
        instance.setText("int num1;\nstring firstname;\n");
        instance.setNewLine();
         instance.setNewLine();
        instance.increase_CurrentWord();
        instance.increase_CurrentWord();
        String expected = "int";
        String result = instance.getCurrentWord();
        assertEquals(expected, result);
       
    }
  

    /**
     * Test of getLines method, of class TextPractice.
     */
    @Test// 
    public void test1GetLines() {
        System.out.println("getLines");
        TextPractice instance = new TextPractice();
       instance.setText("import <iostream>;\nUsing namespace std;\nint main()");//Input
        String[] lines = "import <iostream>;\nUsing namespace std;\nint main()".split("\n");//Expected output
        ArrayList<String> recieved = instance.getLines(3);
        boolean isEqual = true;
        //Lets compare the expected output to input
        for (int i = 0; i < recieved.size() && isEqual; i++) {
            if (recieved.get(i).equals(lines[i]) == false) {
                isEqual = false;
            }
        }

        assertTrue(isEqual);
    }
    @Test
    public void test2GetLines() {
        System.out.println("getLines");
        TextPractice instance = new TextPractice();
        instance.setText("import <iostream>;");
        String[] lines = "import <iostream>;\n".split("\n");
        ArrayList<String> recieved = instance.getLines(3);
        boolean isEqual = true;
        for (int i = 0; i < recieved.size() && isEqual; i++) {
            if (recieved.get(i).equals(lines[i]) == false) {
                isEqual = false;
            }
        }

        assertTrue(isEqual);
    }

    /**
     * Test of cleanString method, of class TextPractice.
     */
    @Test
    public void test1CleanString() {
        System.out.println("cleanString");
        TextPractice instance = new TextPractice();
        String code = "include <iostream>";
        String expected = "include &lt;iostream&gt;";
        String result = instance.cleanString(code);
        assertEquals(expected, result);
    }
     @Test
    public void test2CleanString() {
       System.out.println("cleanString");
        TextPractice instance = new TextPractice();
        String code = "string name = \"deema\"";
        String expected = "string name = &quot;deema&quot;";
         String result = instance.cleanString(code);
        assertEquals(expected,result);
    }
   


    /**
     * Test of compareWord method, of class TextPractice.
     */
    @Test
    public void test1CompareWord() {
        System.out.println("compareWord");
        String orginal = "int";
        String userInput = "int";
        TextPractice instance = new TextPractice();
        boolean expResult = true;
        boolean result = instance.compareWord(orginal, userInput);
        assertEquals(expResult, result);
    }
     @Test
    public void test2CompareWord() {
        System.out.println("compareWord");
        String orginal = "//a";
        String userInput = "/a";
        TextPractice instance = new TextPractice();
        boolean expResult = false;
        boolean result = instance.compareWord(orginal, userInput);
        assertEquals(expResult, result);
    }
     @Test
    public void test3CompareWord() {
        System.out.println("compareWord");
        String orginal = "aa";
        String userInput = "aaa";
        TextPractice instance = new TextPractice();
        boolean expResult = false;
        boolean result = instance.compareWord(orginal, userInput);
        assertEquals(expResult, result);
    }
     @Test
    public void test4CompareWord() {
        System.out.println("compareWord");
        String orginal = "aaa";
        String userInput = "aa";
        TextPractice instance = new TextPractice();
        boolean expResult = false;
        boolean result = instance.compareWord(orginal, userInput);
        assertEquals(expResult, result);
    }
     @Test
    public void test5CompareWord() {
        System.out.println("compareWord");
        String orginal = "main";
        String userInput = "";
        TextPractice instance = new TextPractice();
        boolean expResult = false;
        boolean result = instance.compareWord(orginal, userInput);
        assertEquals(expResult, result);
    }
    
}
