import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void reverseInPlaceTest() {
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
  }

  @Test
  public void reversedTest() {
    int[] input1 = {1,2,3,4,5};
    int[] output = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, output);
  }

  @Test
  public void meanTest() {
    double[] input1 = {3,3,3,3,2,2};
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3.0, output, 0.01);
  }


}
