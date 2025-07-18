import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la temperatura en Celsius que desea comvertir a Fahrenheit y Kelvin");
        double temperatura = entrada.nextDouble();

        double fahrenheit = temperatura * 9 / 5 + 32;
        System.out.printf("%.1f grados Celsius en Farenheit es %.1f\n", temperatura, fahrenheit);

        double kelvin = temperatura + 273.15;
        System.out.printf("%.1f grados Celsius en Kelvin es %.1f\n", temperatura, kelvin);

    }
}
