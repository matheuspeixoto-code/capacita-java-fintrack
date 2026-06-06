package fintrack.service;

import java.util.ArrayList;
import java.util.List;

import fintrack.model.TipoTransacao;
import fintrack.model.Transacao;


public class FinTrackService {

	private List<Transacao> transacoes;

    public FinTrackService() {
        this.transacoes = new ArrayList<>();
    }
	
	public void inserirTransacao(Transacao t) {
			transacoes.add(t);
		
	}


	public void listarTodasTransacoes() {
		System.out.println("=========TRANSACOES=========");
		
		if (transacoes.isEmpty()) {
			System.out.println("=========LISTA DE TRANSACOES VAZIA=========");
			return;
		}
		
		for (Transacao transacao : transacoes) {
			System.out.println(transacao);
			System.out.println("*********************");
		}
		
		System.out.println("============================");
	}
	
	public void listarTransacaoPorTipo(TipoTransacao tipoTransacao) {
		System.out.println("=========TRANSACOES DE " + tipoTransacao.name() + " =========");
			
		if (transacoes.isEmpty()) {
			System.out.println("=========LISTA DE TRANSACOES VAZIA=========");
			return;
		}
		
		for (Transacao transacao : transacoes) {
			if(transacao.getTipoTransacao()==tipoTransacao) {
				System.out.println(transacao);
				System.out.println("*********************");
				
			}
		}
		
		System.out.println("============================");
	}
	
	
	
	public Transacao buscarPorId(Integer id) {

	    for (Transacao transacao : transacoes) {

	        if (transacao.getId().equals(id)) {
	            return transacao;
	        }

	    }

	    return null;
	}
	
	
	public void removerTransacao(Transacao t)  {

		transacoes.remove(t);
	}
	
	public void calcularSaldo() {

	    double saldo = 0;

	    for (Transacao t : transacoes) {
	        saldo += t.impactarSaldo();
	    }

	    System.out.println("\n========= Saldo =========");
	    System.out.println("\nSaldo Atual:");
	    System.out.printf("R$ %.2f%n", saldo);
	    System.out.println("\n=======================");
	}
	
	public void resumoFinanceiro() {

	    int qtdReceitas = 0;
	    int qtdDespesas = 0;

	    double totalReceitas = 0;
	    double totalDespesas = 0;

	    for (Transacao t : transacoes) {

	        if (t.getTipoTransacao() == TipoTransacao.RECEITA) {
	            qtdReceitas++;
	            totalReceitas += t.getValor();
	        } else {
	            qtdDespesas++;
	            totalDespesas += t.getValor();
	        }
	    }

	    double saldo = totalReceitas - totalDespesas;

	    System.out.println("\n========= RESUMO FINANCEIRO =========");
	    System.out.println("Total de transações: " + transacoes.size());

	    System.out.println("\nReceitas:");
	    System.out.println("Quantidade: " + qtdReceitas);
	    System.out.printf("Total: R$ %.2f%n", totalReceitas);

	    System.out.println("\nDespesas:");
	    System.out.println("Quantidade: " + qtdDespesas);
	    System.out.printf("Total: R$ %.2f%n", totalDespesas);

	    System.out.println("\nSaldo Atual:");
	    System.out.printf("R$ %.2f%n", saldo);

	    System.out.println("=====================================");
	}
	
}
