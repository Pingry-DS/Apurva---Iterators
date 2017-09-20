import java.util.Iterator;

public class evenIterator implements Iterator<Integer>
{
  private int currentInt = -2;
  public boolean hasNext()
  {
    return true;
  }

  public Integer next()
{
    currentInt += 2;
    return currentInt + 2;
  }

}
