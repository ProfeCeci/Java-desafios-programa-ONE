import java.util.Scanner;

/*Jéssica trabaja en el departamento de TI de una empresa y necesita garantizar la seguridad de los accesos al sistema interno. Los empleados utilizan una contraseña fija para acceder a sus cuentas, y el sistema debe verificar si la contraseña ingresada es correcta.
Ayuda a Jéssica a crear un programa que, con base en una contraseña predefinida, por ejemplo: 123456, verifique si lo que el usuario digitó es correcto o no. El programa debe comparar el intento con la contraseña correcta y mostrar si el acceso fue permitido o denegado.
Salida esperada:
Ingrese la contraseña: 123456
¡Acceso permitido!
o
Ingrese la contraseña: 123
¡Acceso denegado!
*/
public class ValidacionContrasenia {
    public static void main(String[] args) {
        String contrasenia = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        String intentoContrasenia = scanner.nextLine();

        scanner.close();

        if (intentoContrasenia.equals(contrasenia)){
            System.out.println("¡Acceso permitido!");
        } else {
            System.out.println("¡Acceso denegado!");
        }
    }
}
