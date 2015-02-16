/**
 * Compute the sum of even Fibonacci terms.
 */
public class ProjectEulerTwo {

  /**
   * Compute the sum of the even Fibonacci terms less than 4 million.
   * @param args Arguments - ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfEvenFibTerms(4000000);
    System.out.println("sum: " + sum);

  }

  /**
   * Compute the sum of the even Fibonacci terms less than upperBound.
   * @param upperBound The upper bound.
   * @return The sum.
   */
  public static int computeSumOfEvenFibTerms(int upperBound) {
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
