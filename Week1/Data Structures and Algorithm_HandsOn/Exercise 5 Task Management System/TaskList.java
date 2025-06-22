package TaskManagementSystem;

public class TaskList {
    private Task head;
    public void add(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = task;
        }
    }
    public Task search(String id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId.equals(id)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void delete(String id) {
        if (head == null) return;

        if (head.taskId.equals(id)) {
            head = head.next;
        } else {
            Task temp = head;
            while (temp.next != null && !temp.next.taskId.equals(id)) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
    }
    public void traverse() {
        Task temp = head;
        if (temp == null) {
            System.out.println("Task list is empty.");
        }
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public static void main(String[] args) 
    {
        TaskList taskList = new TaskList();
        taskList.add(new Task("T001", "Design UI", "Pending"));
        taskList.add(new Task("T002", "Write Backend", "In Progress"));
        taskList.add(new Task("T003", "Test App", "Not Started"));
        System.out.println("All Tasks:");
        taskList.traverse();
        System.out.println("\nSearching for Task T002:");
        Task found = taskList.search("T002");
        if (found != null)
        {
            System.out.println("Found: " + found);
        } 
        else 
        {
            System.out.println("Task not found.");
        }
        System.out.println("\nDeleting Task T002...");
        taskList.delete("T002");
        System.out.println("\nTasks after deletion:");
        taskList.traverse();
    }
}
