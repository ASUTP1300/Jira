import java.util.ArrayList;

public class Epic extends Task {

    private ArrayList<Subtask> listSubtask;

    public Epic(String name, String description, String status, int id) {
        super(name, description, status, id);
        this.listSubtask = new ArrayList<>();
    }

    public ArrayList<Subtask> getListSubtask() {
        return listSubtask;
    }

    @Override
    public String toString() {
        return "Epic{" +
                "listSubtask=" + listSubtask +
                "} " + super.toString();
    }
}
