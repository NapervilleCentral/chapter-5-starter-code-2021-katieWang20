
/**
 * Write a description of class taskMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class taskMain 
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        /**
         * 3 Christmas gift for Wife
        6 Christmas gifts for Kids
        5.1 Trash lots of stuff in shop down stairs 
        5.4 Organize shop down stairs 
        2.1 Tile Downstairs landing 
        4 Print Vinyl decal for Advent of Code
        4 Print Vinyl decal Wall downstairs
        1.1 Change Oil in Toyota
        1  Beat Mike in Advent of Code 
        10 Grade 
        10 is highest, 1 is lowest priority
    
         */
        
        Task task1 = new Task(1, "Beat Mike in Advent of Code");
        Task task2 = new Task(5.4, "Organize shop down stairs");
        Task task3 = new Task (10, "Grade");
        Task task4 = new Task (2.1, "Tile Downstairs landing");
        
        Task[] tasks = {task1, task2, task3, task4};
        
        Sorts.insertionSort(tasks);
        
        for (Task task : tasks){
            System.out.println(task);
            System.out.println();
        }
        
        
        System.out.println();
        
        task4.setPriority(10);
        
        Sorts.insertionSort(tasks);
        
        
        for (Task task : tasks){
            System.out.println(task);
            
        }
        System.out.println("\n" + task4);
    }
}
