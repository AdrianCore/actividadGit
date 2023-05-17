import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre = "";

        System.out.println("Introduce tu nombre: ");

        nombre = entrada.nextLine();

        System.out.println("Hola! " + nombre);
    }
}