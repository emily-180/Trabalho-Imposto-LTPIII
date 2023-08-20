package model;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Imposto> listaImpostos = new ArrayList<>();
        listaImpostos.add(new ICMS());
        listaImpostos.add(new Cide());
        listaImpostos.add(new IPI());
        listaImpostos.add(new Confins());
        listaImpostos.add(new ISS());

        List<Produto> produtos = new ArrayList<>();
        Calcula calculo= new Calcula();
        produtos.add(new Produto("Arroz", 7.00, listaImpostos, 0.20));
        produtos.add(new Produto("Feijão", 7.00, listaImpostos, 0.25));

        System.out.println("Produto\t\tPreço Final");
        System.out.println("============================");
        for (Produto produto : produtos) {
            double precoFinal = calculo.calculaTotalValor(produto);
            System.out.printf("%s:\t\tR$%.2f%n", produto.getNomeProduto(), precoFinal);
        }
    }
}
