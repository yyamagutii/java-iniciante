package first_project;

import java.util.Scanner;

public class BaseJava {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		// MEDIA
		System.out.println("Nota 1: ");
		double nota1 = input.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = input.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.println("A média das notas é: " + media);
		*/
		
		/*
		// CASTING DOUBLE PARA INT
		double num1 = 36.80;
		int num2 = (int) num1;
		System.out.println(num2);
		*/
		
		/*
		// CONTATENAÇÃO CHAR E STRING
		char caracter = 'L';
		String nome = "Lucas";
		String concatenacao = String.format("Meu nome é %s e a primeira letra é %s", nome, caracter);
		System.out.println(concatenacao);
		*/
		
		// MULTIPLICAÇÃO
		double precoProduto = 7.99;
		System.out.println("Quantos vc quer?");
		int qtd = input.nextInt();
		double valorFinal = precoProduto * qtd;
		System.out.println("O valor total é " + valorFinal);
		
		
		
	}
}
