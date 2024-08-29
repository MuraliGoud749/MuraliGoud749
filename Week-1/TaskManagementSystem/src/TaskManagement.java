import java.util.Scanner;

public class TaskManagement {
    private Node head;

    public TaskManagement() {
        this.head = null;
    }

    // Add Task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search Task by ID
    public Task searchTaskById(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse Tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete Task by ID
    public void deleteTaskById(int taskId) {
        if (head == null) return;

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManagement tms = new TaskManagement();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = scanner.nextLine();

                    Task task = new Task(id, name, status);
                    tms.addTask(task);
                    break;

                case 2:
                    System.out.print("Enter Task ID to search: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Task searchedTask = tms.searchTaskById(id);
                    if (searchedTask != null) {
                        System.out.println("Task found: " + searchedTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    tms.traverseTasks();
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    tms.deleteTaskById(id);
                    System.out.println("Task deleted");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
