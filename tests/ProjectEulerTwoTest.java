import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the ProjectEulerTwo class.
 */
public class ProjectEulerTwoTest {

  /**
   * Tests the computeSum method to ensure correct sum is computed.
   * @throws Exception If an error occurs.
   */
  @Test
  public void testComputeSum() throws Exception {
    assertEquals("Compute sum of all terms less than 10", 10, ProjectEulerTwo.computeSum(10));
    assertEquals("Compute sum of all terms less than 50", 44, ProjectEulerTwo.computeSum(50));
  }
}