package first_project;

public class Condicional {
	public static void main(String[] args) {
		int anoLancamento = 2025;
		boolean incluidoNoPlano = false;
		String tipoPlano = "plus";
		
		if (anoLancamento >= 2024) {
			System.out.println("Filme novo");
		} else {
			System.out.println("Filme veio");
		}

/*
#####################################################################################################
		 NÃO PRECISA PASSAR O VALOR DO BOOLEAN, ELE JA CONSIDERA O VALOR DEFINIDO PARA COMPARAÇÃO
		 COM STRING USAR .equals() PARA COMPARAR OS VALORES
		 O CONDICIONAL "OU" PRECISA DE APENAS UMA CONDIÇÃO VERDADEIRA PARA SER VERDADEIRO
		 O CONDICIONAL "E" PRECISA QUE AS DUAS CONDIÇÕES SEJAM VERDADEIRAS PARA SER VERDADEIRO
#####################################################################################################
*/
		if(incluidoNoPlano || tipoPlano.equals("plus")) {
			System.out.println("Pode assistir sem pagar");
		} else {
			System.out.println("Pagar pelo filme ou assine");
		}
		
		if(incluidoNoPlano && tipoPlano.equals("plus")) {
			System.out.println("Pode assistir sem pagar");
		} else {
			System.out.println("Pagar pelo filme ou assine");
		}
		
/*
 	SWITCH CASE É UMA ALTERNATIVA PARA EVITAR A REPETIÇÃO DE IFS
 	A FUNÇÃO RECEBE UM PARAMETRO E DE ACORDO COM O VALOR EXECUTA UMA AÇÃO PREVISTA DENTRO DOS CASOS
  
 */
		switch(tipoPlano) {
		case "plus":
			System.out.println("Pode assitir");
			break;
		case "gratuito":
			System.out.println("terá propaganda");
			break;
		}
	}
}
