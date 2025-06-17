package first_project;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
		//SYSTEM.IN RASTREA SE TEVE ALGUMA INSERSÃO PELO TECLADO
		Scanner input = new Scanner(System.in);
		
/*
   1º VARIAVEL DE ITERACAO
   2º CONDIÇÃO
   3º INCREMENTO
 */
		
		//AS VARIAVEIS USADAS DENTRO DE UM LOOP DEVEM SER INICIALIZADAS
		double nota = 0;
		double media = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Insira uma nota: ");
			nota = input.nextDouble();
			// ACUMULANDO/SOMANDO OS VALORES DA ITERAÇÃO
			media = media + nota; //media += nota;
		}
		
		//MEDIA DAS SOMAS DAS NOTAS ACUMULADAS
		System.out.println(media/3);
	}
}	
