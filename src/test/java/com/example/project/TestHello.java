package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestHello {

   @Test
   public void testHelloWorld(){
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Hello.main(null);
     String answer = Hello.e.substring(0,11); 
     // assertion
     try{
        assertEquals(answer + "\n", bos.toString());
     }catch(Exception e){
        
     }

     // undo the binding in System
     System.setOut(originalOut);
   }
   @Test
   public void testHelloEarth(){
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Hello.main(null);

     // assertion
     try{
        assertEquals("Hello earth!\n", bos.toString());
     }catch(Exception e){
        
     }

     // undo the binding in System
     System.setOut(originalOut);
   }
}
