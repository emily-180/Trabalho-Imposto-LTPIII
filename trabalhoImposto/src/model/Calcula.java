package model;

public class Calcula {
	
	public double calculaTotalImposto(Produto produto) {
		double valor=0;
		for(Imposto imposto: produto.getImpostos()) {
			valor+= imposto.getTaxa();
			System.out.println(valor);
		}		
		return valor;
	}
	
	public double calculaTotalValor(Produto produto) {
		double precoFinal= produto.getPrecoCusto()+ calculaTotalImposto(produto) + (produto.getPrecoCusto() * produto.getMargemLucro());
		return precoFinal;			
	}
}
