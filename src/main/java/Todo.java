public class Todo extends Task {

    /**
     * Initializes a new instance of a task that is to be done, according to the task description.
     * By default, this task is set to "not done" and does not have any date/time attached to it.
     *
     * @param description Describes what needs to be done in this task
     */
    public Todo(String description) {
        super(description);
    }

    /**
     * Prepends a checkbox "[T]" to the front of the task, which indicates the type of task.
     *
     * @return String containing a type icon that is prepended in front of the task description.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
