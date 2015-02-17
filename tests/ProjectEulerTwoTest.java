import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerTwo class.
 */
public class ProjectEulerTwoTest {

  /**
   * Ensures the computeSumOfEvenFibTerms methods computes the correct value.
   * @throws Exception If an error occurs.
   */
  @Test
  public void testComputeSumOfEvenFibTerms() throws Exception {
    assertEquals("Compute sum for terms less than 10", 10, ProjectEulerTwo.computeSumOfEvenFibTerms(10));
    assertEquals("Compute sum for terms less than 50", 44, ProjectEulerTwo.computeSumOfEvenFibTerms(50));
  }
}