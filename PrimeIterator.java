import java.util.Iterator;

public class PrimeIterator implements Iterator<Integer>
{
  private int n = 2;

  public Integer next()
  {

    while(!isPrime(n))
    {
      n++;
    }

    return n++;
  }

  private boolean isPrime(int n)
  {
    for(int i = 2; i <= n/2; i++)
    {
      if(n%i == 0)
        return false;
    }
    return true;
  }

  public boolean hasNext()
  {
    return true;
  }

}
