import java.util.Iterator;

public class FiboIterator implements Iterator<Integer>
{
  /**
  *Iterates through squares from 0 to 100 inclusive
  */
  private int n = 0;
  private int j = 1;

  private boolean l = true;

  public Integer next()
  {
    int x = 0;

    if(l)
    {
      x = n;
      n = j + n;
    }
    else
    {
      x = j;
      j = j + n;
    }
    l = !l;
    return x;
  }

  public boolean hasNext()
  {
    return true;
  }
}
