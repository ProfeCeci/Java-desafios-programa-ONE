import java.util.Scanner;

/*Verificación de compatibilidad para donar sangre
María trabaja en un banco de sangre y necesita verificar si un donante es compatible para donar sangre. Para ser compatible, el donante debe cumplir con los siguientes criterios:
Tener entre 18 y 65 años.
Pesar más de 50 kg.
Ella desea un programa que reciba la edad y el peso del donante e indique si es compatible para donar sangre. Si no lo es, el programa debe indicar qué criterio no fue cumplido.
¿Cómo crearías un programa que reciba la edad y el peso del donante y muestre un mensaje indicando si es compatible o no, además de informar qué criterio no fue cumplido, si es el caso?
Ejemplo de entrada:
Ingrese la edad del donante: 17
Ingrese el peso del donante (en kg): 55
Salida esperada:
El donante no es compatible.
Motivo: Debe tener entre 18 y 65 años.*/
public class VerficacionDonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el peso del donante: ");
        int peso = scanner.nextInt();

        if (edad >= 18 && edad <= 65){
            if (peso > 50){
                System.out.println("El donante es compatible.");
            } else {
                System.out.println("El donante no es compatible.");
                System.out.println("Motivo: Debe pesar más de 50 kg.");
            }
        } else {
            System.out.println("El donante no es compatible.");
            System.out.println("Motivo: Debe tener entre 18 y 65 años.");
        }

        scanner.close();
    }
}
