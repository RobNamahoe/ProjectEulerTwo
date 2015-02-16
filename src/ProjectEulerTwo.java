/**
 * Computes the sum of even terms of the Fibonacci sequence.
 */
public class ProjectEulerTwo {

  /**
   * Compute the sum of even Fibonacci terms less than 4 million.
   * @param args Arguments - ignored.
   */
  public static void main(String[] args) {
    int sum = computeSum(4000000);
    System.out.println("sum: " + sum);
  }

  /**
   * Computes the sum of even Fibonacci terms less than a given upperBound.
   * @param upperBound The upperBound.
   * @return The sum of the applicable terms.
   */
  public static int computeSum(int upperBound) {
    int head = 0;
    int tail = 1;
    int sum = 0;

    while (head + tail < upperBound) {
      int temp = head + tail;
      if ((temp) % 2 == 0) {
        sum += (temp);
      }
      head = tail;
      tail = temp;
    }
    return sum;
  }


}
