package fintrack.model;

import java.time.LocalDate;

public class Despesa  extends Transacao{

	public Despesa() {
		super();
		
	}

	public Despesa(String descricao, double valor) {
		super(descricao, valor, TipoTransacao.DESPESA, LocalDate.now());
	}

	@Override
	public double impactarSaldo() {
		
		return -getValor();
	}

}
