package first_project;

import java.util.Scanner;

public class temperatura {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em Celsius: ");
		double celsius = input.nextDouble();
		
		// TRANSOFRMAÇÃO
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("A temperatura tranformada para fahrenheit será de: " + fahrenheit);
	}
}

/*
public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }

}
*/
