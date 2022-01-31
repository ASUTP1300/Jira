public class Subtask extends Task {

    int idEpic;

    public Subtask(String name, String description, String status, int id, int idEpic) {
        super(name, description, status, id);
        this.idEpic = idEpic;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "idEpic=" + idEpic +
                "} " + super.toString();
    }
}
