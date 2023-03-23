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
			
			while (true) {
				System.out.println("                             _________________________________________________________________________");
				System.out.println("                            |                               MENU                                      |");
				System.out.println("                            |_________________________________________________________________________|");
				System.out.println("                            |                      Escolha as opções a seguir:                        |");
				System.out.println("                            | (1) Inserir Renda                                                       |");
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

				if (opcao == 9) {
					System.out.println("Tio Patinhas te espera!");
					leia.close();
					System.exit(0);

				}
			}	
			
	}
}		
			
			
			

