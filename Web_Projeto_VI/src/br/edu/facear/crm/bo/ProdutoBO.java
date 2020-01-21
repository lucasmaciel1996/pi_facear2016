package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.ProdutoDao;
import br.edu.facear.crm.entity.Produto;



public class ProdutoBO {
	
	
	public void salvar(Produto produto){	
		ProdutoDao produtoDAO = new ProdutoDao();
		produtoDAO.Salvar(produto);		
	}
	
	public List<Produto> listar() {
		ProdutoDao produtoDAO = new ProdutoDao();
		return produtoDAO.listar();
	}
	
	public void editar(Produto produto) {
		ProdutoDao produtoDAO = new ProdutoDao();
		produtoDAO.editar(produto);
	}

	public Produto getObjectById(Long id) {		
		ProdutoDao produtoDAO = new ProdutoDao();
		return produtoDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		ProdutoDao produtoDAO = new ProdutoDao();
		produtoDAO.excluir(id);
	}
	
	public void novo(Produto produto) {
		ProdutoDao produtoDAO = new ProdutoDao();
		produtoDAO.novo(produto);
	}
	
	public void voltar(Produto produto) {
		ProdutoDao produtoDAO = new ProdutoDao();
		produtoDAO.voltar(produto);
	}
	
}
