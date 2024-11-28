import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe el título de la tarea: ");
        String titulo = br.readLine();

        System.out.println("Escribe la descripción de la tarea: ");
        String descripcion = br.readLine();

        System.out.println("Escribe la fecha de vencimiento de la tarea: ");
        String fecha = br.readLine();
    }
}