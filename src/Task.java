public class Task implements Priority{
    //variables
    private int priority;
    private String taskName;
    private boolean isComplete;

    //constructor
    public Task(String taskName, int priority){
        this.taskName = taskName;
        this.priority = priority;
        isComplete = false;
    }

    //methods
    public void setPriority(int priority){
        this.priority = priority;
    }
    public int getPriority(){
        return priority;
    }
    public void doTask(){
        System.out.println("Doing task....");
        System.out.println("Please wait...");
        System.out.println("Done!");
        isComplete = true;
        this.setPriority(0);
    }
    public String toString(){
        return ("Task " + this.taskName + ". Priority: " + this.priority + ". Complete? " + this.isComplete)
    }
}
