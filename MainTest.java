import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

  @Test // ohne @Test wird kein Test erkannt
  public void testNothing() { }

  @Test
  public void testSomeStuff() {
    // Das Ergebnis der Addition von 2 und 3 ist 5
    int actualResult = 2+3;
    int expectedResult = 5;
    assertEquals(expectedResult, actualResult);
    
    // Das Neuanlegen eines Strings liefert ein Objekt ungleich Null
    String newString = "hello";
    assertNotNull(newString); 
    
    // 3 * 7 ist größer als 4 * 5
    int threeAndSeven = 3 * 7;
    int fourAndFive = 4 * 5;
    boolean condition = threeAndSeven > fourAndFive; 
    assertTrue(condition);
  }
}