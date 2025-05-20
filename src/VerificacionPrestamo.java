/*
Emerson trabaja en un banco y necesita verificar si un número digitado por el cliente está dentro del rango permitido de valores para un préstamo, que va de 1000 a 5000 dólares.
Crea un programa que reciba un valor y muestre si está dentro del intervalo permitido o no.
Ejemplo de entrada:
Ingrese el valor del préstamo: 750
Salida esperada:
El valor 750 no está dentro del intervalo permitido para el préstamo.*/

import java.util.Scanner;

public class VerificacionPrestamo {
    public static void main(String[] args) {
        int MIN = 1000;
        int MAX = 5000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del prestamo: ");
        int valorPrestamo = scanner.nextInt();

        if (valorPrestamo >= MIN && valorPrestamo <= MAX) {
            System.out.printf("El valor %d está dentro del intervalo permitido para el préstamo.", valorPrestamo);
        } else {
            System.out.printf("El valor %d no está dentro del intervalo permitido para el préstamo.", valorPrestamo);
        }
        scanner.close();
    }
}
