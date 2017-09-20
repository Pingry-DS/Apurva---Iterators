import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;
public class SquaresTo100Iterator implements Iterator<Integer>
{
  /**
  *Iterates through squares from 0 to 100 inclusive
  */
  private int n = 0;
  public Integer next()
  {
    if(hasNext())
    {
      n++;
      return n * n;
    }

    throw new NoSuchElementException("Squares only up to 100");

  }

  public boolean hasNext()
  {
    return n < 10;
  }

  public void remove()
  {
    throw new UnsupportedOperationException("Squares cannot be removed");
  }

}
