import java.util.Scanner;

/*Pedro está aprendiendo Java y se encontró con un problema: necesita crear un programa que compare dos números enteros proporcionados por el usuario e indique cuál es el mayor o si son iguales. Sin embargo, tiene dificultades para implementar la lógica de comparación y mostrar el resultado correctamente. ¡Ayuda a Pedro a resolver este problema! Crea un programa que solicite al usuario dos números enteros, los compare y muestre un mensaje indicando cuál es el mayor o si ambos son iguales.

Ejemplo de entrada:
Ingrese el primer número: 10
Ingrese el segundo número: 25
Salida esperada:
El número mayor es 25.  */


public class ComparacionNumerosEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numeroUno = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = scanner.nextInt();

        if (numeroUno > numeroDos){
            System.out.println("El número mayor es " + numeroUno + ".");
        } else if (numeroUno < numeroDos) {
            System.out.println("El número mayor es " + numeroDos + ".");
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}
