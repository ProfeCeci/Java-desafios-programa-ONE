import java.util.Scanner;

/*Verificación de código de acceso y nivel de permiso
Juan está desarrollando un sistema de seguridad para una empresa. Para acceder al sistema, el usuario debe proporcionar:Un código de acceso numérico (el código correcto es 2023).
Un nivel de permiso numérico (los niveles válidos son 1, 2 o 3).
El sistema solo permitirá el acceso si:
El código de acceso es correcto.
El nivel de permiso es válido (1, 2 o 3).
De lo contrario, el acceso será denegado, y el programa debe informar el motivo (código incorrecto, nivel de permiso inválido o ambos).
Crea un programa que reciba el código de acceso y el nivel de permiso y muestre un mensaje indicando si el acceso fue permitido o denegado, además del motivo, si es el caso.
Ejemplo de entrada:
Ingrese el código de acceso: 2023
Ingrese el nivel de permiso: 2
Salida esperada: Acceso permitido. ¡Bienvenido al sistema!*/
public class VerificacionAccesoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoCorrecto = 2023;

        System.out.print("Ingrese el código de acceso: ");
        int codigo = scanner.nextInt();

        System.out.print("Ingrese el nivel de permiso: ");
        int nivelPermiso = scanner.nextInt();

        boolean codigoValido = codigo == codigoCorrecto;
        boolean nivelPermisoValido = nivelPermiso == 1 || nivelPermiso == 2 || nivelPermiso == 3;

        if (codigoValido && nivelPermisoValido){
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        } else {
            System.out.println("Acceso denegado. Motivo(s):");
            if (!codigoValido) {
                System.out.println("- Código de acceso incorrecto.");
            }
            if (!nivelPermisoValido) {
                System.out.println("- Nivel de permiso inválido.");
            }
        }

        scanner.close();
    }
}
