public class DesafioConversor {
    public static void main(String[] args) {
        double temperaturaCelsius = 13.5;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8)+32;

        String mensaje = String.format("La temperatura %f °C es equivalenta a %f °F", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensaje);

        int temperaturaFahrenheitEntera = (int)temperaturaFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaFahrenheitEntera);
    }
}
