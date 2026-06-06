package fintrack.controller;

import fintrack.exceptions.DescricaoInvalidaException;
import fintrack.exceptions.TransacaoNaoEncontradaException;
import fintrack.exceptions.ValorInvalidoException;
import fintrack.model.Despesa;
import fintrack.model.Receita;
import fintrack.model.TipoTransacao;
import fintrack.model.Transacao;
import fintrack.service.FinTrackService;

public class TransacaoController {

	FinTrackService service = new FinTrackService();
	
	public void inserirTransacao(String descricao,double valor,TipoTransacao tipoTransacao) throws ValorInvalidoException, DescricaoInvalidaException {
		
		if(valor<=0) {
			throw new ValorInvalidoException("Valor Precisar ser positivo!");
		}
		
		if(descricao==null ||descricao.isBlank()) {
			throw new DescricaoInvalidaException("Descricao nao pode ser vazia!");
		}
		
		Transacao transacao;
		
		if (tipoTransacao==TipoTransacao.RECEITA) {
			transacao = new Receita(descricao, valor);
		} else {
			transacao = new Despesa(descricao, valor);
		}
	
		
		 service.inserirTransacao(transacao);
		
	}
	
	
	public void listarTodasTransacao() {
		service.listarTodasTransacoes();
	}


	
	public void listarTransacaoPorTipo(TipoTransacao tipoTransacao) {
		service.listarTransacaoPorTipo(tipoTransacao);
		
	}

	public Transacao buscarPorId(Integer id)
	        throws TransacaoNaoEncontradaException {

	    Transacao transacao = service.buscarPorId(id);

	    if (transacao == null) {
	        throw new TransacaoNaoEncontradaException("Transação não encontrada!");
	    }

	    return transacao;
	}
	
	public void removerTransacao(Integer id)
	        throws TransacaoNaoEncontradaException {

	    Transacao transacao = service.buscarPorId(id);

	    if (transacao == null) {
	        throw new TransacaoNaoEncontradaException(
	            "Transação não encontrada!"
	        );
	    }

	    service.removerTransacao(transacao);
	}
	
	
	public void resumoFinanceiro() {
		service.resumoFinanceiro();
	}


	public void mostrarSaldo() {
		service.calcularSaldo();
		
	}
	
}
