package br.edu.facear.crm.teste;

import br.edu.facear.crm.bo.ProdutoBO;
import br.edu.facear.crm.entity.Produto;


public class ProdutoTeste {
	
	
	
	public static void main(String[] args) {
		testeInsert();
	}

	private static void testeInsert() {
		Produto produto = new Produto();
		produto.setDescricao("Impressora");
		produto.setValor(350);
		//VendaDao vendadao = new VendaDao();
		//vendadao.listar();
		//Venda venda = new Venda();
	
		
		ProdutoBO produtoBO = new ProdutoBO();
		try {
			produtoBO.salvar(produto);
		} catch (Exception e) {
			
			System.err.println("Erro ao inserir"+e.getMessage());
			
		}
		System.out.println("salvo com sucesso!");
		
	}

}
