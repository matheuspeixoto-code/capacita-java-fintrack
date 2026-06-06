package fintrack.model;

import java.time.LocalDate;

public class Receita extends Transacao {
	

	public Receita() {
		super();
		
	}
	
	public Receita(String descricao, double valor) {
		super(descricao, valor, TipoTransacao.RECEITA, LocalDate.now());
		
	}

	@Override
	public double impactarSaldo() {
		
		return getValor() ; 
	}

}
