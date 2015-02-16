import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for the ProjectEulerTwo class.
 */
public class ProjectEulerTwoTest {

  /**
   * Ensure computeSumOfEvenFibTerms computes the correct sum.
   * @throws Exception If an error occurs.
   */
  @Test
  public void testComputeSumOfEvenFibTerms() throws Exception {
    Assert.assertEquals("Compute sum for terms less than 10", 10, ProjectEulerTwo.computeSumOfEvenFibTerms(10));
    Assert.assertEquals("Compute sum for terms less than 100", 44, ProjectEulerTwo.computeSumOfEvenFibTerms(100));
  }
}