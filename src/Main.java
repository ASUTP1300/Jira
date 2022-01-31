import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Task task = new Task("задача 1 ", "описание задачи 1", "new", 1);
        Task task2 = new Task("задача 2 ", "описание задачи 2", "new", 2);
        Epic epic = new Epic("эпик 1", "описание эпика", "new", 3);
        manager.createTask(task);
        manager.createTask(task2);
        manager.createTask(epic);


        System.out.println(
                manager.getTask(1));
        manager.updateTask(task2);

        manager.deleteTask(2);

        System.out.println(manager.getTaskList());


        //Manager manager = new Manager();

        //manager.uniqueId();
        //manager.uniqueId();
        //manager.uniqueId();
        //manager.uniqueId();

        //System.out.println(manager.getId());
    }
}
