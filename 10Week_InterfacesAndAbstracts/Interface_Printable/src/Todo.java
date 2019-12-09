public class Todo implements Printable{

    private String task;
    private String priority;
    private boolean isDone;

    public String getTask() {
        return "Buy milk";
    }

    public String getPriority() {
        return "high";
    }

    public boolean isDone() {
        return true;
    }

    @Override
    public void printAllFields() {
        System.out.printf("Task: %s | Priority: %s | Done: %s", getTask(), getPriority(), isDone());
    }
}
