package projetos;

import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public static void main(String[] args) {

		String nome;

		int opcao, idade, opRenda, inv, opInv, opPoup, opDespesa, opDicas, opRelatorio;

		double porcentagemInvMedio, porcentagemInvCurto, porcentagemInvLongo, rendaFixa = 0, varRenda = 0, invCurto = 0,
				invMedio = 0, invLongo = 0, invTotal = 0, somaPoup = 0, somaVariavel = 0, somaDespesa = 0, varDespesa,
				totalDespVar = 0, totalDespFix = 0, saldo1 = 0, saldo2 = 0, somaTotalDespesas = 0;

		boolean vazio;

		Scanner leia = new Scanner(System.in);

		List<Double> rendaVar = new ArrayList<Double>();

		List<Double> listaPoup = new ArrayList<Double>();

		List<Double> despesaVar = new ArrayList<Double>();

		List<Float> despesaFixa = new ArrayList<Float>();

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

						somaTotalDespesas = somaVariavel + rendaFixa;

						saldo1 = rendaFixa + varRenda;
						System.out.println("\nRenda Fixa: R$ " + rendaFixa);
						System.out.println("\nRenda Variavel: R$" + varRenda);
						System.out.println("\nRenda Total: R$" + somaTotalDespesas);
						System.out.println("\n\nEsse e o seu resumo de Ganhos: R$" + saldo1);
						break;

					case 0:
						System.out.println("\nSeu saldo atual de: R$" + saldo1);
						break;

					default:
						System.out.print("Opção Inválida! \n\n ");
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
					System.out.println("     | (1) Adicionar Despesas Fixas                             |");
					System.out.println("     |                                                          |");
					System.out.println("     | (2) Adicionar Despesas Casuais                           |");
					System.out.println("     |                                                          |");
					System.out.println("     | (3) Alterar Lancamentos                                  |");
					System.out.println("     |                                                          |");
					System.out.println("     | (4) Valor total de Despesas                              |");
					System.out.println("     |                                                          |");
					System.out.println("     | (0) Voltar ao Menu Principal                             |");
					System.out.println("     |__________________________________________________________|");
					System.out.println(" \n");
					System.out.print("Digite a opção desejada: \n");
					opDespesa = leia.nextInt();

					switch (opDespesa) {
					case 1:
						float fixaDespesa;
						System.out.println("\nDigite o valor da sua Despesa Fixa: ");
						fixaDespesa = leia.nextFloat();
						despesaFixa.add(fixaDespesa);
						System.out.println("\nDespesa Fixa adicionada com sucesso!");
						for (int x = 0; x < despesaFixa.size(); x++) {
							totalDespFix += despesaFixa.get(x);
						}
						break;
					case 2:
						System.out.println("\nInsira o valor da entrada:");
						varDespesa = leia.nextDouble();
						despesaVar.add(varDespesa);

						for (int i = 0; i < despesaVar.size(); i++) {
							totalDespVar += despesaVar.get(i);
						}
						break;
					case 3:
						int opAlteraDesp, indiceFix, indiceVar;
						do {
							System.out.println("      __________________________________________________________");
							System.out.println("     |                      MENU DESPESAS                       |");
							System.out.println("     |__________________________________________________________|");
							System.out.println("     |              Escolha uma das opções a seguir:            |");
							System.out.println("     | (1) Listar Despesas Fixas                                |");
							System.out.println("     |                                                          |");
							System.out.println("     | (2) Remover Despesa Fixas                                |");
							System.out.println("     |                                                          |");
							System.out.println("     | (3) Listar Despesas Casuais                              |");
							System.out.println("     |                                                          |");
							System.out.println("     | (4) Remover Despesa Casual                               |");
							System.out.println("     |                                                          |");
							System.out.println("     | (0) Voltar ao Menu Principal                             |");
							System.out.println("     |__________________________________________________________|");
							System.out.println(" \n");
							System.out.print("Digite a opção desejada: \n");
							opAlteraDesp = leia.nextInt();

							switch (opAlteraDesp) {
							case 1:
								vazio = despesaFixa.isEmpty();
								if (vazio == true) {
									System.out.print("Voce nao tem despesas para listar!");
								} else {
									System.out.println("\n Todos as despesas inseridas: $" + despesaFixa);
								}

								break;
							case 2:
								System.out.print("Digite a posicao do lancamento que deseja remover: \n");
								indiceFix = leia.nextInt();
								if (despesaFixa.size() < indiceFix) {
									System.out.println(
											"Lancamento inexistente, digite a posicao de um lancamento que conste na lista");

								} else {
									despesaFixa.remove(indiceFix - 1);
								}

								System.out.print("Lancamento removido com sucesso \n");

								break;
							case 3:
								vazio = despesaVar.isEmpty();
								if (vazio == true) {
									System.out.print("Voce nao tem despesas para lsitar!");
								} else {
									System.out.println("\n Todos as despesas inseridas: $" + despesaVar);
								}

								break;
							case 4:
								System.out.print("Digite a posicao do lancamento que deseja remover: \n");
								indiceVar = leia.nextInt();
								if (despesaVar.size() < indiceVar) {
									System.out.println(
											"Lancamento inexistente, digite a posicao de um lancamento que conste na lista");

								} else {
									despesaVar.remove(indiceVar - 1);
								}

								System.out.print("Lancamento removido com sucesso \n");
								break;
							case 0:

								break;
							default:
								System.out.print("Opção Inválida! \n\n ");
							}
							break;

						} while (opAlteraDesp != 0);

						break;

					case 4:
						somaDespesa = totalDespFix + totalDespVar;
						System.out.println("\nEsse e o seu resumo de Gastos:");
						System.out.println("\n\nDespesa Fixa: " + totalDespFix);
						System.out.println("\n\nDespesa Variavel: " + totalDespVar);
						System.out.println("\nTotal de Saidas: " + somaDespesa);

						break;
					case 0:
						saldo2 = saldo1 - somaDespesa;
						System.out.println("\nSeu saldo atual é de:  " + saldo2);
						break;
					default:
						System.out.print("Opção Inválida! \n\n ");
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
						if (saldo2 < adicionarPoup) {
							System.out.println("\nSaldo insufiente!!!");
						}
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
						// System.out.println("Lista todas as rendas inseradas na poupança: R$" +
						// listaPoup);
						System.out.printf("Total da renda inserida na poupança: R$ %.2f", somaPoup);
						break;
					case 0:
						saldo2 -= somaPoup;
						System.out.println("\nSaldo atual é de: " + saldo2);
						break;

					default:
						System.out.print("Opção Inválida! \n\n ");
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
						if (saldo2 < invCurto) {
							System.out.println("\nSaldo insulficiente!!!!");
						} else {
							System.out.println("\n Valor de Investimento inserido com sucesso!");
						}
						break;

					case 2:
						System.out.println("\n Insira um valor para investimento a médio prazo: ");
						invMedio = leia.nextDouble();
						if (saldo2 < invMedio) {
							System.out.println("\nSaldo insulficiente!!!!");
						} else {
							System.out.println("\n Valor de Investimento inserido com sucesso!");
						}
						break;

					case 3:
						System.out.println("\n Insira um valor para investimento a longo prazo:  ");
						invLongo = leia.nextDouble();
						if (saldo2 < invLongo) {
							System.out.println("\nSaldo insulficiente!!!!");
						} else {
							System.out.println("\n Valor de Investimento inserido com sucesso!");
						}
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
						saldo2 -= invTotal;
						System.out.println("\nSaldo atual é de: " + saldo2);
						break;

					default:
						System.out.print("Opção Inválida! \n\n ");
					}

				} while (opInv != 0);
				break;

			// Menu Resumo Geral
			case 5:

				do {
					System.out.println("      __________________________________________________________");
					System.out.println("     |                     MENU Relatório Geral	                |");
					System.out.println("     |__________________________________________________________|");
					System.out.println("     |              Escolha uma das opções a seguir:            |");
					System.out.println("     | (1) Relatório Geral					                    |");
					System.out.println("     |                                                          |");
					System.out.println("     | (0) Voltar ao Menu Principal                             |");
					System.out.println("     |__________________________________________________________|");
					System.out.print("\n");
					System.out.print("Digite a opção desejada: \n");
					opRelatorio = leia.nextInt();

					switch (opRelatorio) {

					case 1:

						System.out.println("	GASTOS	");
						System.out.println("----------------------------------------------");
						System.out.println("Total Renda: R$" + somaTotalDespesas);
						System.out.println("Total Despesas Fixa: R$" + totalDespFix);
						System.out.println("Total Despesas Variaveis: R$" + totalDespVar);
						System.out.println("Total Poupança: R$" + somaPoup);
						System.out.println("Total Investimento: R$" + invTotal);
						System.out.println("----------------------------------------------");

						// Calculo para verificar a porcentagem dos gastos
						double porDespesasFixa = (totalDespFix * 100) / somaTotalDespesas;
						double porDespesasVar = (totalDespVar * 100) / somaTotalDespesas;
						double porPoupanca = (somaPoup * 100) / somaTotalDespesas;
						double porInv = (invTotal * 100) / somaTotalDespesas;

						if (porDespesasFixa <= 50) {
							System.out.println("Porcentagem Despesas Fixa: " + porDespesasFixa);
							System.out.println(
									" O Tio Patinhas está orgulhoso de você! \n Conseguiu manter suas despesas dentro do esperado!\n");
						} else {
							System.out.println("O tio Patinhas está desapontado! Você ultrapassou X% do orçamento. "
									+ "\n Recomendamos que releia as preciosas dicas do Tio Patinhas!\n");
						}
						leia.nextLine();

						System.out.println("----------------------------------------------");
						if (porDespesasVar <= 30) {
							System.out.println("Porcentagem Despesas Var: " + porDespesasVar);
							System.out.println(
									" O Tio Patinhas está orgulhoso de você! \n Conseguiu manter suas despesas dentro do esperado!\n");
						} else {
							System.out.println("O tio Patinhas está desapontado! Você ultrapassou X% do orçamento. "
									+ "\n Recomendamos que releia as preciosas dicas do Tio Patinhas!\n");
						}
						leia.nextLine();

						System.out.println("----------------------------------------------");
						if (porPoupanca <= 10) {
							System.out.println("Porcentagem Poupança: " + porPoupanca);
							System.out.println(
									" O Tio Patinhas está orgulhoso de você! \n Conseguiu manter suas despesas dentro do esperado!\n");
						} else {
							System.out.println("O tio Patinhas está desapontado! Você ultrapassou X% do orçamento. "
									+ "\n Recomendamos que releia as preciosas dicas do Tio Patinhas!\n");
						}
						leia.nextLine();

						System.out.println("----------------------------------------------");
						if (porInv <= 10) {
							System.out.println("Porcentagem Investimento: " + porInv);
							System.out.println(
									" O Tio Patinhas está orgulhoso de você! \n Conseguiu manter suas despesas dentro do esperado!\n");
						} else {
							System.out.println("O tio Patinhas está desapontado! Você ultrapassou X% do orçamento. "
									+ "\n Recomendamos que releia as preciosas dicas do Tio Patinhas!\n");
						}

						break;

					case 0:
						break;

					default:
						System.out.println("\n Opção Inválida!");
					}

				} while (opRelatorio != 0);

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

				switch (opDicas) {

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
					System.out.print("Opção Inválida! \n\n ");
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
