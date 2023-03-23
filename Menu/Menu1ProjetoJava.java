package Exercicios;

import java.util.Scanner;

public class Menu1ProjetoJava {

	public static void main(String[] args) {
			
			String nome;
			int opcao, idade;
			Scanner leia = new Scanner(System.in);
		
			
			
			System.out.println("*********************************************************************************************************************************");
			System.out.println("*                                                        BEM VINDE AO TIO PATINHAS                                              *");
			System.out.println("*                                            O sistema que te ajuda a organizar suas finanças                                   *");
			System.out.println("*********************************************************************************************************************************");
			System.out.println("\n                           Primeiro, queremos te conhecer melhor! Por favor, digite seu nome: ");
			nome = leia.nextLine();
			System.out.println("\n                           Qual a sua idade? ");
			idade = leia.nextInt();
			System.out.println("\n                           Obrigada pelas informações " +nome+ "! Agora vamos te apresentar o nosso menu: " );
			
			do {
				System.out.println("                             _________________________________________________________________________");
				System.out.println("                            |                               MENU                                      |");
				System.out.println("                            |_________________________________________________________________________|");
				System.out.println("                            |                      Escolha as opções a seguir:                        |");
				System.out.println("                            | (1) Inserir Renda                                                       |"); //Inserir opcao resumo contas
				System.out.println("                            |                                                                         |");
				System.out.println("                            | (2) Inserir Despesas Fixas                                              |");        
				System.out.println("                            |                                                                         |");
				System.out.println("                            | (3) Inserir Despesas Variadas                                           |");
				System.out.println("                            |                                                                         |");
				System.out.println("                            | (4) Inserir valor para Poupança                                         |");
				System.out.println("                            |                                                                         |");
				System.out.println("                            | (5) Inserir valor para Investimentos                                    |");
				System.out.println("                            |                                                                         |");
				System.out.println("                            | (6) Dicas do Tio Patinhas para organizar suas Finanças                  |");
				System.out.println("                            |                                                                         |");
				System.out.println("                            | (7) SAIR                                                                |");
				System.out.println("                            |_________________________________________________________________________|");
				System.out.println(" \n");
				opcao = leia.nextInt();
				
				
			switch (opcao) {
			case 1:
				System.out.println("\n\n Insira a sua Renda: ");
				break;
				
			case 2:
				System.out.println("\n Insira suas Despesas Variadas: ");
				break;
		
			case 3:
				System.out.println("\n Insira valor de Emergência: ");
				break;
				
			case 4:
				System.out.println("\n\n Insira o valor de Investimento: ");
				break;
				
			case 5:
				System.out.println("\n\n Resumo Geral");
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
				
			case 7:
				System.out.println("\n\nObrigado por usar!!!");
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		} while (opcao != 7);
		System.out.println("\nTio Patinhas te espera!");
		
			
	}
}		
			
			
			

