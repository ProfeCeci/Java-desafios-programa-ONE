import java.util.Scanner;
/*
Julia es profesora y necesita un programa que la ayude a determinar si un estudiante ha sido aprobado en la asignatura. La regla de la escuela es:

El estudiante es aprobado si su promedio final es mayor o igual a 7.0.
Si el promedio está entre 5.0 y 6.9, está en recuperación.
Si es inferior a 5.0, está reprobado.
Crea un programa que, a partir de una variable media, muestre la situación del estudiante según las reglas de la escuela.*/

public class Aprobacion {
    public static void main(String[] args) {
        double media;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el promedio del estudiante:");
        media = scanner.nextDouble();
        scanner.close();

        if (media >= 7.0 && media <= 10){
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue aprobado.");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y está en recuperación.");
        } else if (media >= 0 && media < 5.0) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue reprobado.");
        } else {
            System.out.println("El promedio es incorrecto");
        }
    }
}
