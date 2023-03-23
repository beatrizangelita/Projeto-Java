
public class MenuDespesa {
	package projetos;

	import java.util.List;
	import java.util.Scanner;

	public class projet1 {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int cod, codDespesa, dia;
			Double despesaFixa, somaVariavel = 0, var;
			List<Double> despesaVar = new ArrayList<Double>();
			
			
			do {
			
				cod = leia.nextInt();
				switch (cod) {
				case 1:
					do {
					System.out.println("      __________________________________________________________");
					System.out.println("     |                      MENU RENDA                          |");
					System.out.println("     |__________________________________________________________|");
					System.out.println("     |              Escolha uma das opções a seguir:            |");
					System.out.println("     | (1) Inserir Despesas Fixas                               |");
					System.out.println("     |                                                          |");
					System.out.println("     | (2) Adicionar Despesas Casuais                           |");        
					System.out.println("     |                                                          |");
					System.out.println("     | (3) Resumo de Gastos                                     |");        
					System.out.println("     |                                                          |");
					System.out.println("     | (0) SAIR                                                 |");
					System.out.println("     |__________________________________________________________|");
					codDespesa = leia.nextInt();
					
					switch(codDespesa){
					case 1:
						System.out.println("\nDigite o valor da sua Despesa Fixa: ");
						despesaFixa = leia.nextDouble();
						System.out.println("\nDespesa Fixa adicionada com sucesso!");
						break;
					case 2:
						System.out.println("\nInsira o valor da entrada:");
						var = leia.nextDouble();
						despesaVar.add(var);
						
						for(Double listaVar:despesaVar) {
							somaVariavel += despesaVar;
						}
						break;
					case 4:
						System.out.println("\nEsse e o seu resumo de Ganhos:");
						System.out.println("\n\nRenda Fixa: "+despesaFixa);
						System.out.println("\n\nRenda Variavel: "+somaVariavel);
						System.out.println("\nTotal de Entradas: "+(despesaFixa+somaVariavel));
						
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

}
