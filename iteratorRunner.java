
import java.util.Iterator;
public class iteratorRunner
{
  public static void main(String[] arguments)
  {
    Iterator<Integer> i = new evenIterator();
    Iterator<Integer> j = new SquaresTo100Iterator();
    Iterator<Integer> x = new PrimeIterator();
    Iterator<Integer> k = new FiboIterator();
    int testNumber = 0;
    while(testNumber < 100)
    {
      System.out.println(k.next());
      testNumber += 1;;
    }
  }
}
