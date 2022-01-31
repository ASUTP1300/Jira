import java.util.*;

public class Manager {
    private int uId;

    private HashMap<Integer, Task> taskSaving = new HashMap<>();// таблица ID, name, description

    public List<Task> getTaskList() {
        return new ArrayList<>(taskSaving.values());
    }

    public void clearList() {
        taskSaving.clear();
    }

    public int getId() {
        return uId;
    }

    public Task getTask(int idTask) {
        //Вынести как отдельный метод!
        for (Map.Entry<Integer, Task> entry : taskSaving.entrySet()) {
            if (entry.getValue().getId() == idTask) {
                return  entry.getValue();
            }
        }
        //Доработать!!
        return null;
    }

    public int getuId() {
        return uId;
    }

    public HashMap<Integer, Task> getTaskSaving() {
        return taskSaving;
    }

    public void createTask(Task newTask) {
        taskSaving.put(uniqueId(), newTask);
    }

    public void updateTask(Task updateTask) {
        int id = updateTask.getId();
        for (Map.Entry<Integer, Task> entry : taskSaving.entrySet()) {
            if (entry.getValue().getId() == id) {
                taskSaving.put(entry.getKey(), updateTask);
            }
        }
    }

    //idDelete, idUpdate - заменить везде на просто id!
    public void deleteTask(int idDelete) {
        Iterator<Map.Entry<Integer, Task>> iterator = taskSaving .entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().getId() == idDelete)
                iterator.remove();
        }
    }

    public int uniqueId() {
        return this.uId++;
    }
}
