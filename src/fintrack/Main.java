package fintrack;

import java.util.Scanner;

import fintrack.controller.TransacaoController;
import fintrack.exceptions.TransacaoNaoEncontradaException;
import fintrack.model.TipoTransacao;
import fintrack.model.Transacao;
import fintrack.utils.DadosTransacao;

public class Main {

	public static void main(String[] args) {
		TransacaoController app = new TransacaoController();
		int opcao = 0;
		Integer id;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.println("\n===== FINTRACK - SEU CONTROLE FINANCEIRO =====");
            System.out.println("1. Adicionar receita");
            System.out.println("2. Adicionar despesa");
            System.out.println("3. Listar Todas transações");
            System.out.println("4. Listar transações DE RECEITAS");
            System.out.println("5. Listar transações DE DESPESAS");
            System.out.println("6. Buscar transação");
            System.out.println("7. Mostrar saldo atual");
            System.out.println("8. Mostrar resumo financeiro");
            System.out.println("9. Remover transação");
            System.out.println("10. Sair");
            System.out.println("=============================================");
            System.out.print("Escolha uma opção: ");
            
			opcao = sc.nextInt();
			
			
			switch (opcao) {
				case 1:
				    DadosTransacao.cadastrarTransacao(sc, app, TipoTransacao.RECEITA);
				    break;
	
				case 2:
					DadosTransacao.cadastrarTransacao(sc, app, TipoTransacao.DESPESA);
				    break;
	
	            case 3:
	                app.listarTodasTransacao();
	                break;
	            case 4:
	                app.listarTransacaoPorTipo(TipoTransacao.RECEITA);;
	                break;
	            case 5:
	                app.listarTransacaoPorTipo(TipoTransacao.DESPESA);
	                break;
	
	            case 6:
	            	System.out.print("Informe o ID da transação: ");
	                id = sc.nextInt();

	                try {

	                    Transacao transacao = app.buscarPorId(id);
	                    
	                    System.out.println("=====================");
	                    System.out.println("Transação encontrada:");
	                    System.out.println(transacao);
	                    
	                    System.out.println("=====================");

	                } catch (TransacaoNaoEncontradaException e) {

	                    System.out.println(e.getMessage());

	                }

	                break;
	
	            case 7:
	                app.mostrarSaldo();
	                break;
	
	            case 8:
	                app.resumoFinanceiro();
	                
	                break;
	
	            case 9:
	            	
	            	
	            	System.out.println("LISTA DE TRANSACOES");
	            	app.listarTodasTransacao();
	            	
	            	System.out.println("Informe o ID DA TRANSACAO QUE DESEJA REMOVER: ");
	            	id=sc.nextInt();
					try {
						
						app.removerTransacao(id);
						System.out.println("Transacao removida");
						
					} catch (TransacaoNaoEncontradaException e) {
						
						System.out.println("Erro: " + e.getMessage());
					}
		            	
	                break;
	
	            case 10:
	            	System.out.println("Sistema Encerrado");
	                break;
	                
	            default:
	                System.out.println("Opção inválida!");
	        }
			
		} while (opcao!=10);
		

	}

}
