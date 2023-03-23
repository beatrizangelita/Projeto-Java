package Exercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu1ProjetoJava {

	public static void main(String[] args) {
			
			String nome;
			int opcao, idade, opRenda, dia;;
			Scanner leia = new Scanner(System.in);
		        Double rendaFixa, somaVariavel = 0, var;
		        List<Double> rendaVar = new ArrayList<Double>();
		
			
			
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
				do {
				System.out.println("      __________________________________________________________");
				System.out.println("     |                      MENU RENDA                          |");
				System.out.println("     |__________________________________________________________|");
				System.out.println("     |              Escolha uma das opções a seguir:            |");
				System.out.println("     | (1) Inserir Renda Fixa                                   |");
				System.out.println("     |                                                          |");
				System.out.println("     | (2) Alterar Renda Fixa                                   |");
				System.out.println("     |                                                          |");
				System.out.println("     | (3) Adicionar Renda Variavel                             |");        
				System.out.println("     |                                                          |");
				System.out.println("     | (4) Resumo de Ganhos                                     |");        
				System.out.println("     |                                                          |");
				System.out.println("     | (0) SAIR                                                 |");
				System.out.println("     |__________________________________________________________|");
				opRenda = leia.nextInt();
				
				switch(opRenda){
				case 1:
					System.out.println("\nDigite o valor da sua Renda Fixa: ");
					rendaFixa = leia.nextDouble();
					System.out.println("\nRenda Fixa adicionada com sucesso!");
					break;
				case 2:
					if(rendaFixa == 0) {
						System.out.println("\nVoce não possui Renda Fixa cadastrada."
								+ "\nCadastre um valor antes de alterar!");
					}else {
					System.out.println("\nDigite o valor da sua NOVA Renda Fixa");
					rendaFixa = leia.nextDouble();}
					System.out.println("\nValor da Renda Fixa alterado com sucesso!");
					break;
				case 3:
					System.out.println("\nInsira o valor da entrada:");
					var = leia.nextDouble();
					rendaVar.add(var);
					
					for(Double listaVar:rendaVar) {
						somaVariavel += rendaVar;
					}
					break;
				case 4:
					System.out.println("\nEsse e o seu resumo de Ganhos:");
					System.out.println("\n\nRenda Fixa: "+rendaFixa);
					System.out.println("\n\nRenda Variavel: "+somaVariavel);
					System.out.println("\nTotal de Entradas: "+(rendaFixa+somaVariavel));
					
					break;
				case 0:
					
					break;
				default:
					System.out.println("\nOpcao Invalida!");
					break;
			}
				}while(opRenda != 0);
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
			
			
			

