import java.util.Scanner;

public class DesafioCuentaBancaria {
    public static void main(String[] args) {
        String usuario = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        Scanner scanner = new Scanner(System.in);

        String mensaje = """
                *******************************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f$
                
                *******************************************
                """.formatted(usuario, tipoDeCuenta, saldo);
        System.out.println(mensaje);


        String menu = """
                ** Escriba el numero de la opcion desada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir 
                """;

        while (opcion != 9) {
            System.out.println(menu);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea retirar");
                    double retiro = scanner.nextDouble();
                    if (saldo < retiro) {
                        System.out.println("Su saldo es insuficiente");
                    } else {
                        saldo -= retiro;
                        System.out.println("Su saldo restantes es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea depositar");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Su saldo actual es: " + saldo + "$");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
                    break;
            }

        }

        System.out.println("Finalizando el programa. Muchas gracias por usar este servicio.");
    }
}
