import java.util.Scanner;

/* Verificación de día hábil
Carlos trabaja en una empresa de logística que opera solo de lunes a viernes, sin actividades los fines de semana. Para evitar confusiones, necesita un programa que, al recibir un día de la semana, indique si es un día hábil o no.
Crea un programa que reciba un día de la semana (en minúsculas) y muestre un mensaje indicando si es un día hábil o no.
Ejemplo de Entrada:
Ingrese el día de la semana (en minúsculas): miércoles
Salida esperada:
Miércoles es un día hábil.
Si el usuario ingresa un día de fin de semana, el programa responderá:
Domingo no es un día hábil. */

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (en minúsculas): ");
        String dia = scanner.nextLine();

        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") || dia.equals("jueves") || dia.equals("viernes")) {
            System.out.println(dia + " es un día hábil.");
        } else if (dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println(dia + " no es un día hábil.");
        } else {
            System.out.println("El día es incorrecto.");
        }
        scanner.close();
    }
}
