public class Todo implements Printable{

    private String task;
    private String priority;
    private boolean isDone;

    public Todo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    public String getTask() {
        return "";
    }

    public String getPriority() {
        return "";
    }

    public boolean isDone() {
        return true;
    }

    @Override
    public void printAllFields() {
        System.out.printf("Task: %s | Priority: %s | Done: %s\n", getTask(), getPriority(), isDone());
    }
}
