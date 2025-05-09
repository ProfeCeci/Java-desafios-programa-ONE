import java.util.Scanner;

/*Verificación de descuento en compras
Marcos trabaja en una tienda y necesita verificar si un cliente tiene derecho a un descuento del 10% en su compra. El descuento se aplica solo si el valor de la compra es mayor o igual a $100.00. Para ello, quiere un programa que permita ingresar el valor de la compra y muestre si el descuento fue aplicado o no, junto con el nuevo valor después del descuento, en caso de que corresponda.
Basado en este escenario, crea un programa que reciba el valor de la compra y muestre un mensaje indicando si el descuento fue aplicado o no.
Ejemplo de entrada:
Ingrese el valor de la compra: 120.0
Salida esperada:
Descuento del 10% aplicado.
Nuevo valor: $108.0
Si el valor de la compra es menor a $100.00, el programa mostrará:
Descuento no aplicado.
Valor total: $80.0
*/
public class VerificacionDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100) {
            double valorConDescuento = valorCompra * 0.9;
            System.out.printf("Descuento del 10%% aplicado.\nNuevo valor: $%.2f\n", valorConDescuento);
        } else {
            System.out.printf("Descuento no aplicado.\nValor total: $%.2f", valorCompra);
        }
    }
}
