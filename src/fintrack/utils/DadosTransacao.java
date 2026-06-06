package fintrack.utils;

import java.util.Scanner;

import fintrack.controller.TransacaoController;
import fintrack.exceptions.DescricaoInvalidaException;
import fintrack.exceptions.ValorInvalidoException;
import fintrack.model.TipoTransacao;

public class DadosTransacao {
	
	public static void cadastrarTransacao(
	        Scanner sc,
	        TransacaoController app,
	        TipoTransacao tipo) {

	    sc.nextLine();

	    System.out.print("Descrição: ");
	    String descricao = sc.nextLine();

	    System.out.print("Valor: ");
	    double valor = sc.nextDouble();

	    try {
	    	
	    	app.inserirTransacao(descricao, valor,tipo);
	    	
	        if (tipo == TipoTransacao.RECEITA) {
	        	
	            System.out.println("Receita inserida com sucesso!");
	            
	        } else {
	            
	            System.out.println("Despesa inserida com sucesso!");
	        }

	    }  catch (ValorInvalidoException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} catch (DescricaoInvalidaException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		}
	}
	
	
}
