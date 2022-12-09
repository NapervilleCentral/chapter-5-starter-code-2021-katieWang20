
/**
 * Katie Wang
 */

public class Task implements priorities, Comparable
{
    // instance variables - replace the example below with your own
    
    private int x;
    private double pNumber;
    private String pAction;
    /**
     * Constructor for objects of class Task
     */
    public Task(double number, String priorityAction)
    {
        // initialise instance variables
        number = pNumber;
        String pAction = priorityAction;
    }
    /**
     * 
     * sets the priority of the action from 1-10 (least to greatest priority)
     * @param p
     */
    public void setPriority(double p){
        pNumber = p;
        
    } 
    
    public double getPriority(){
        return pNumber;
    }
    /**
     * 
     * compares priority number of the task
     * @param obj
     * 
     */    
    public int compareTo(Object obj){
        
        Task aTask = (Task) obj;
        
        if (pNumber - aTask.pNumber > 0){
            return 1;
        }else if (pNumber - aTask.pNumber < 0){
            return -1;
        }else{
            return 0;
        }
        
        
    }
}
