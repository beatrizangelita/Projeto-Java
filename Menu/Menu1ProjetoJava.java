package Exercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu1ProjetoJava {

	public static void main(String[] args) {
			
			String nome;

		int opcao, idade, opRenda, inv, opInv, opPoup, opDespesa, opDicas;

		double porcentagemInvMedio, porcentagemInvCurto, porcentagemInvLongo, rendaFixa = 0, varRenda, invCurto = 0,
				invMedio = 0, invLongo = 0, invTotal = 0, somaPoup = 0, somaVariavel = 0, despesaFixa = 0, somaDespesa = 0,
				varDespesa;

		boolean vazio;

		Scanner leia = new Scanner(System.in);

		List<Double> rendaVar = new ArrayList<Double>();

		List<Double> listaPoup = new ArrayList<Double>();

		List<Double> despesaVar = new ArrayList<Double>();

		// Menu Principal
		System.out.println(
				"*********************************************************************************************************************************");
		System.out.println(
				"*                                                        BEM VINDE AO TIO PATINHAS                                              *");
		System.out.println(
				"*                                            O sistema que te ajuda a organizar suas finanças                                   *");
		System.out.println(
				"*********************************************************************************************************************************");
		System.out.println(
				"\n                           Primeiro, queremos te conhecer melhor! Por favor, digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n                           Qual a sua idade? ");
		idade = leia.nextInt();
		System.out.println("\n                           Obrigada pelas informações " + nome
				+ "! Agora vamos te apresentar o nosso menu: ");

		do {
			System.out.println(
					"                             _________________________________________________________________________");
			System.out.println(
					"                            |                               MENU                                      |");
			System.out.println(
					"                            |_________________________________________________________________________|");
			System.out.println(
					"                            |                      Escolha as opções a seguir:                        |");
			System.out.println(
					"                            | (1) Acessar Menu Renda                                                  |"); 
			System.out.println(
					"                            |                                                                         |");
			System.out.println(
					"                            | (2) Acessar Menu Despesas                                               |");
			System.out.println(
					"                            |                                                                         |");
			System.out.println(
					"                            | (3) Acessar Menu Poupança                                               |");
			System.out.println(
					"                            |                                                                         |");
			System.out.println(
					"                            | (4) Acessar Menu Investimentos                                          |");
			System.out.println(
					"                            |                                                                         |");
			System.out.println(
					"                            | (5) RELATÓRIO GERAL                                                     |");
			System.out.println(
					"                            |                                                                         |");
			System.out.println(
					"                            | (6) Dicas do Tio Patinhas para organizar suas Finanças                  |");
			System.out.println(
					"                            |                                                                         |");
			System.out.println(
					"                            | (7) SAIR                                                                |");
			System.out.println(
					"                            |_________________________________________________________________________|");
			System.out.println(" \n");
			opcao = leia.nextInt();

			// Menu Renda
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
					System.out.println("     | (3) Inserir Renda Variavel                               |");
					System.out.println("     |                                                          |");
					System.out.println("     | (4) Resumo de Ganhos                                     |");
					System.out.println("     |                                                          |");
					System.out.println("     | (0) Voltar ao Menu Principal                             |");
					System.out.println("     |__________________________________________________________|");
					System.out.println(" \n");
					System.out.print("Digite a opção desejada: \n");
					opRenda = leia.nextInt();

					switch (opRenda) {
					case 1:
						System.out.println("\nDigite o valor da sua Renda Fixa: ");
						rendaFixa = leia.nextDouble();
						System.out.println("\nRenda Fixa adicionada com sucesso!");
						break;
					case 2:
						if (rendaFixa == 0) {
							System.out.println("\nVoce não possui Renda Fixa cadastrada."
									+ "\nCadastre um valor antes de alterar!");
						} else {
							System.out.println("\nDigite o valor da sua NOVA Renda Fixa");
							rendaFixa = leia.nextDouble();
						}
						System.out.println("\nValor da Renda Fixa alterado com sucesso!");
						break;
					case 3:
						System.out.println("\nInsira o valor da entrada:");
						varRenda = leia.nextDouble();
						rendaVar.add(varRenda);

						for (int i = 0; i < rendaVar.size(); i++) {
							somaVariavel += rendaVar.get(i);
						}
						break;
					case 4:
						System.out.println("\nEsse e o seu resumo de Ganhos:");
						System.out.println("\n\nRenda Fixa: " + rendaFixa);

						break;
					case 0:

						break;
					default:
						System.out.print(cores.TEXT_RED_BOLD + "Opção Inválida! \n\n " + cores.TEXT_RESET);
						break;
					}
				} while (opRenda != 0);
				break;

			// Menu Despesas
			case 2:

				do {
					System.out.println("      __________________________________________________________");
					System.out.println("     |                      MENU DESPESAS                       |");
					System.out.println("     |__________________________________________________________|");
					System.out.println("     |              Escolha uma das opções a seguir:            |");
					System.out.println("     | (1) Inserir Despesas Fixas                               |");
					System.out.println("     |                                                          |");
					System.out.println("     | (2) Adicionar Despesas Casuais                           |");
					System.out.println("     |                                                          |");
					System.out.println("     | (3) Resumo de Gastos                                     |");
					System.out.println("     |                                                          |");
					System.out.println("     | (0) Voltar ao Menu Principal                             |");
					System.out.println("     |__________________________________________________________|");
					System.out.println(" \n");
					System.out.print("Digite a opção desejada: \n");
					opDespesa = leia.nextInt();

					switch (opDespesa) {
					case 1:
						System.out.println("\nDigite o valor da sua Despesa Fixa: ");
						despesaFixa = leia.nextDouble();
						System.out.println("\nDespesa Fixa adicionada com sucesso!");
						break;
					case 2:
						System.out.println("\nInsira o valor da entrada:");
						varDespesa = leia.nextDouble();
						despesaVar.add(varDespesa);

						for (int i = 0; i < despesaVar.size(); i++) {
							somaDespesa += despesaVar.get(i);
						}
						break;
					case 4:
						System.out.println("\nEsse e o seu resumo de Ganhos:");
						System.out.println("\n\nRenda Fixa: " + despesaFixa);
						System.out.println("\n\nRenda Variavel: " + somaDespesa);
						System.out.println("\nTotal de Entradas: " + (despesaFixa + somaDespesa));

						break;
					case 0:

						break;
					default:
						System.out.print(cores.TEXT_RED_BOLD + "Opção Inválida! \n\n " + cores.TEXT_RESET);
					}
					
				} while (opDespesa != 0);

				break;

			case 3:

				// Menu Poupança
				do {

					System.out.println("	      __________________________________________________________");
					System.out.println("	     |                      MENU POUPANÇA                       |");
					System.out.println("	     |__________________________________________________________|");
					System.out.println("	     |              Escolha uma das opções a seguir:            |");
					System.out.println("	     | (1) Adicionar Valor                                      |");
					System.out.println("	     |                                                          |");
					System.out.println("	     | (2) Listar Valor 	                                    |");
					System.out.println("	     |                                                          |");
					System.out.println("	     | (3) Remover Valor                                        |");
					System.out.println("	     |                                                          |");
					System.out.println("	     | (4) Valor total da Poupança                              |");
					System.out.println("	     |                                                          |");
					System.out.println("	     | (0) Voltar ao Menu Principal                             |");
					System.out.println("	     |__________________________________________________________|");
					System.out.print("\n");
					System.out.print("Digite a opção desejada: \n");

					opPoup = leia.nextInt();

					switch (opPoup) {

					case 1:
						System.out.println("Digite um valor que deseja inserir na poupança: ");
						double adicionarPoup = leia.nextDouble();
						listaPoup.add(adicionarPoup);
						break;

					case 2:
						vazio = listaPoup.isEmpty();
						if (vazio == true) {
							System.out.print("Poupança está vazia!");
						} else {
							System.out.println("\n Todos as rendas inseridos na poupança: $" + listaPoup);
						}

						break;
					case 3:
						vazio = listaPoup.isEmpty();
						if (vazio == true) {
							System.out.print("Não há renda para remover! Poupança está vazia!");
						} else {
							System.out.print("\n Digite a renda que deseja remover: ");
							double removePoup = leia.nextDouble();
							if (listaPoup.contains(removePoup)) {
								listaPoup.remove(removePoup);
							}
						}
						break;
					case 4:
						for (int i = 0; i < listaPoup.size(); i++) {
							somaPoup += listaPoup.get(i);
						}
						System.out.println("Lista todas as rendas inseradas na poupança: " + listaPoup);
						System.out.printf("Total da renda insera na poupança: %.2f", somaPoup);
						break;
					case 0:
						break;

					default:
						System.out.print(cores.TEXT_RED_BOLD + "Opção Inválida! \n\n " + cores.TEXT_RESET);
					}

				} while (opPoup != 0);

				break;

			// Menu Investimento
			case 4:

				do {
					System.out.println("      __________________________________________________________");
					System.out.println("     |                  MENU INVESTIMENTOS                      |");
					System.out.println("     |__________________________________________________________|");
					System.out.println("     |              Escolha uma das opções a seguir:            |");
					System.out.println("     | (1) Inserir Investimento a Curto Prazo                   |");
					System.out.println("     |                                                          |");
					System.out.println("     | (2) Inserir Investimento a Medio Prazo                   |");
					System.out.println("     |                                                          |");
					System.out.println("     | (3) Inserir Investimentos a Longo Prazo                  |");
					System.out.println("     |                                                          |");
					System.out.println("     | (4) Valor Total de Investimentos                         |");
					System.out.println("     |                                                          |");
					System.out.println("     | (5) Médias de cada variável                              |");
					System.out.println("     |                                                          |");
					System.out.println("     | (0) Voltar ao Menu Principal                             |");
					System.out.println("     |__________________________________________________________|");
					System.out.print("\n");
					System.out.print("Digite a opção desejada: \n");
					opInv = leia.nextInt();

					switch (opInv) {
					case 1:
						System.out.println("Insira um valor para investimento a curto prazo: ");
						invCurto = leia.nextDouble();
						System.out.println("\n Valor de Investimento inserido com sucesso!");
						break;

					case 2:
						System.out.println("\n Insira um valor para investimento a médio prazo: ");
						invMedio = leia.nextDouble();
						System.out.println("\n Valor de Investimento inserido com sucesso!");
						break;

					case 3:
						System.out.println("\n Insira um valor para investimento a longo prazo:  ");
						invLongo = leia.nextDouble();
						System.out.println("\n Valor de Investimento inserido com sucesso!");
						break;

					case 4:
						invTotal = invCurto + invMedio + invLongo;
						System.out.println("\n Valor total inserido para investimentos: R$ " + invTotal);
						break;

					case 5:
						invTotal = invCurto + invMedio + invLongo;
						porcentagemInvCurto = (invCurto * 100) / invTotal;
						leia.nextLine();

						System.out.printf("\n Porcentagem de investimentos a curto prazo: `%.2f%%`",
								porcentagemInvCurto);

						porcentagemInvMedio = (invMedio * 100) / invTotal;
						System.out.printf("\n Porcentagem de investimentos a médio prazo: `%.2f%%`",
								porcentagemInvMedio);

						porcentagemInvLongo = (invLongo * 100) / invTotal;
						System.out.printf("\n Porcentagem de investimentos a longo prazo: `%.2f%%`",
								porcentagemInvLongo);

						System.out.println("\n");

					case 0:
						break;

					default:
						System.out.print(cores.TEXT_RED_BOLD + "Opção Inválida! \n\n " + cores.TEXT_RESET);
					}

				} while (opInv != 0);
				break;

			// Menu Resumo Geral
			case 5:
				System.out.println("\n\n Resumo Geral");
				break;

			// Orientações sobre investimento
			case 6:
				
				System.out.println("      __________________________________________________________");
				System.out.println("     |                  		MENU DICAS		                |");
				System.out.println("     |__________________________________________________________|");
				System.out.println("     |              Escolha uma das opções a seguir:            |");
				System.out.println("     | (1) Dicas							                    |");
				System.out.println("     |                                                          |");
				System.out.println("     | (0) Voltar ao Menu Principal                             |");
				System.out.println("     |__________________________________________________________|");
				System.out.print("\n");
				System.out.print("Digite a opção desejada: \n");
				opDicas = leia.nextInt();
				
				switch(opDicas) {
				
				case 1:
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
					break;

				default:
					System.out.print(cores.TEXT_RED_BOLD + "Opção Inválida! \n\n " + cores.TEXT_RESET);
				}
				
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