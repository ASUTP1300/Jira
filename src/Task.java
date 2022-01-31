import java.util.ArrayList;
import java.util.HashMap;

public class Task {

    private String name;
    private String description;
    private String status;
    private int id;

   Manager manager = new Manager();


    public Task(String name, String description, String status, int id) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.id =id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public int getId() {
      return id;
    }



    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
