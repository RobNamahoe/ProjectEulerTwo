/**
 * Created by rckndn on 2/3/15.
 */
public class ProjectEulerTwo {


  public static void main(String[] args) {
    int head = 0;
    int tail = 1;
    int sum = 0;

    while (head + tail < 4000000) {
      int temp = head + tail;
        if ( (temp) % 2 == 0 ) {
          sum+=(temp);
        }
        head = tail;
        tail = temp;
    }
    System.out.println("sum: " + sum);

  }



}
