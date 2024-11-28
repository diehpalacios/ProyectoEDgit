import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String[] actualizar(String[] tareas, String descripcion, String tarea){
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].equals(tarea)){
                tareas[i] = tarea;
            }
        }
        return tareas;
    }

    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la tarea a actualiziar: ");
        String tarea = br.readLine();
        System.out.println("Ingrese el nuevo valor: ");
        String descripcion = br.readLine();
        actualizar(array, descripcion, tarea);
    }
}