import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio =  new Random().nextInt(100);
        int intentos = 5;
        int i = 0;

        while (i < intentos) {
            System.out.println("Ingrese un número entre 0 y 100 para adivinar el número secreto: ");
             int numeroUsuario = scanner.nextInt();

            if (numeroAleatorio == numeroUsuario){
                System.out.println("¡Adivinaste!");
                break;
            } else if (numeroAleatorio > numeroUsuario) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }

            i++;
        }

        if (i == intentos){
            System.out.println("No tienes más intentos el número era " + numeroAleatorio);
        }
    }
}
