import java.util.Scanner;

/* Verificación de triángulo
Marcos está estudiando geometría y necesita verificar si tres lados pueden formar un triángulo. Para que tres lados formen un triángulo, la suma de dos lados debe ser mayor que el tercer lado. Él quiere un programa que reciba tres lados y muestre un mensaje indicando si los lados pueden formar un triángulo o no.
Con base en este escenario, crea un programa que reciba tres lados y muestre un mensaje indicando si los lados pueden formar un triángulo o no.
Ejemplo de entrada:
Ingrese el primer lado: 3
Ingrese el segundo lado: 4
Ingrese el tercer lado: 5
Copia el código
Salida esperada:
Los lados pueden formar un triángulo.*/
public class VerificacionTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificar si tres lados pueden formar un triángulo");
        System.out.println("**************************************************");

        System.out.print("Ingrese el primer lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingrese el segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Ingrese el tercer lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Los lados deben ser números positivos.");
        } else if ( (lado1+lado2) > lado3 && (lado1+lado3) > lado2 && (lado2+lado3) > lado1){
            System.out.println("Los lados pueden formar un triangulo.");
        } else {
            System.out.println("Los lados no forman un triangulo");
        }

        scanner.close();
    }
}
