package model;

import java.util.List;

public class Produto {
	private String nomeProduto;
	private double precoCusto;
	private List<Imposto> impostos;
	private double margemLucro;
	
	public Produto(String nomeProduto, double precoCusto, List<Imposto> impostos, double margemLucro) {
        this.nomeProduto = nomeProduto;
        this.precoCusto = precoCusto;
        this.impostos = impostos;
        this.margemLucro = margemLucro;
    }

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public List<Imposto> getImpostos() {
		return impostos;
	}

	public void setImpostos(List<Imposto> impostos) {
		this.impostos = impostos;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
}
