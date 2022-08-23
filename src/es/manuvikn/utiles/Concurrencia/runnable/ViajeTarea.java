package es.manuvikn.utiles.Concurrencia.runnable;

public class ViajeTarea implements Runnable{

    private String tarea;

    public ViajeTarea() {

    }

    public ViajeTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getTarea() {
        return this.tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    @Override
    public void run() {
        for (int i =0; i < 10000; i ++) {
            System.out.println( i+1 + ": " + this.tarea);
        }
    }
}
