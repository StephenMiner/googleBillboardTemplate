

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class BillboardTester {

   @Test
   public void testBillboard(){
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     GoogleBillboard.main(null);

     // assertion
     assertEquals("7.427466391E9\n", bos.toString()); 

     // undo the binding in System
     System.setOut(originalOut);
   }
}
