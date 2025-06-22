package TaskManagementSystem;

public class Task {
	String taskId, taskName, status;
    Task next;
    public Task(String id, String name, String status) {
        this.taskId = id;
        this.taskName = name;
        this.status = status;
        this.next = null;
    }
    public String toString() {
        return "Task ID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}
