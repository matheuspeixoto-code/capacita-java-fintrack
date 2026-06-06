package fintrack.model;

import java.time.LocalDate;

public abstract class Transacao {
	
	private static Integer proxId=0;
	
	private Integer id;
	private String descricao;
	private double valor;
	private TipoTransacao tipoTransacao;
	private LocalDate data;
	
	public Transacao() {
		super();
	}


	public Transacao(String descricao, double valor, TipoTransacao tipoTransacao, LocalDate data) {
		super();
		this.id=proxId++;
		this.descricao = descricao;
		this.valor = valor;
		this.tipoTransacao = tipoTransacao;
		this.data = data;
	}


	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}


	public void setTipoTransacao(TipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	
	@Override
	public String toString() {
	    return "ID: " + id +
	           "\nDescrição: " + descricao +
	           "\nValor: R$ " + valor +
	           "\nTipo: " + tipoTransacao +
	           "\nData: " + data;
	}
	
	 public abstract double impactarSaldo();
	
	
}
