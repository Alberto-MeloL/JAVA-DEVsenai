public class Task {
    //atributos
    String description;
    boolean done;
    //construtor
    public Task(String description) {
        super();

        this.description = description;
        this.done = false;//tarefa não concluida

        
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isDone() {//pois e uma boolean
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    //GETTERS AND SETTERS--^
}
