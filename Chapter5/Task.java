
/**
 * Katie Wang
 * Task 
 */

public class Task implements priorities, Comparable
{
    // instance variables - replace the example below with your own
    
    private int x;
    private double pNumber;
    private String pTask;
    /**
     * Constructor for objects of class Task
     * @param number, priority task
     */
    public Task(double number, String priorityTask)
    {
        // initialise instance variables
        pNumber = number;
        pTask = priorityTask;
    }
    /**
     * 
     * sets the priority of the action from 1-10 (least to greatest priority)
     * @param p (priority number)
     */
    public void setPriority(double p){
        pNumber = p;
        
    } 
    /**
     * gets the priority number
     * @param none
     */
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
    /**
     * 
     * Returns task action and priority number
     * @param none
     * 
     */
    public String toString(){
        String stuff;
        stuff = "Task: " + pTask;
        stuff += "\n Priority: " + pNumber;
        return stuff;
    }
    
}
