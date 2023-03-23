package projetos;

import java.util.Scanner;

public class projet1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op;

		do {
		
			op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("\n\n Insira a sua Renda: ");
				break;
				
			case 2:
				System.out.println("\n Insira suas Despesas Variadas: ");
				break;
				
			case 3:
				System.out.println("\n\n Insira suas Despesas Fixas: ");
				break;
				
			case 4:
				System.out.println("\n Insira Valor de Emergência: ");
				break;
				
			case 5:
				System.out.println("\n\n Insira o Valor de Investimento: ");
				break;
				
			case 6:
				System.out.println("\nPrimeiro: Comece aos poucos");
				System.out.println("\nSegundo: Estude");
				System.out.println("\nTerceiro: Invista em si mesmo ");
				System.out.println("\nQuarto: Ética e Trabalho árduo");
				System.out.println("\nQuinto: Faça bons investimentos");
				System.out.println("\nSexto: Estude e fique de olho nas Inflações");
				System.out.println("\nSétimo: Faça o que ama");
				System.out.println("\nOitavo: Faça um fundo de emergência");
				System.out.println("\nNono: Nunca trapaceie");
				System.out.println("\nDécimo: Tenha Resiliência nunca recue perante um desafio");
				System.out.println("\nDécimo Primeiro: Valorize sua família");
				break;
				
			case 0:
				System.out.println("\n\nObrigado por usar....");
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		} while (op != 0);
	}

}
