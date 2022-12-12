
public interface lockable
{
    public void setkey (int pass); //use 1234 for convenience
    public void lock ( int locker);
    public void unlock(int unlocker);
    public boolean locked ();

}