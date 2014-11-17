

/**
 * Write a description of class event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class event
{
    String eventName;
    int daysToEvent;
    
    public event(String s, int i)
    {
        this.eventName = s;
        this.daysToEvent = i;
    }


    public int sampleMethod(int i)
    {
        return daysToEvent * 2;
    }

}
