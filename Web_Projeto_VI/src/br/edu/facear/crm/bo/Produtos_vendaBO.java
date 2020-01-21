package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.Produtos_vendaDao;
import br.edu.facear.crm.entity.Produtos_venda;

public class Produtos_vendaBO {
	
	public void salvar(Produtos_venda produtos_venda){	
		Produtos_vendaDao produtos_vendaDAO = new Produtos_vendaDao();
		produtos_vendaDAO.Salvar(produtos_venda);		
	}
	
	public List<Produtos_venda> listar() {
		Produtos_vendaDao produtos_vendaDAO = new Produtos_vendaDao();
		return produtos_vendaDAO.listar();
	}
	
	public void editar(Produtos_venda produtos_venda) {
		Produtos_vendaDao produtos_vendaDAO = new Produtos_vendaDao();
		produtos_vendaDAO.editar(produtos_venda);
	}

	public Produtos_venda getObjectById(Long id) {		
		Produtos_vendaDao produtos_vendaDAO = new Produtos_vendaDao();
		return produtos_vendaDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		Produtos_vendaDao produtos_vendaDAO = new Produtos_vendaDao();
		produtos_vendaDAO.excluir(id);
	}
	
	public void novo(Produtos_venda produtos_venda) {
		Produtos_vendaDao produtos_vendaDAO = new Produtos_vendaDao();
		produtos_vendaDAO.novo(produtos_venda);
	}
	
	public void voltar(Produtos_venda produtos_venda) {
		Produtos_vendaDao produtos_vendaDAO = new Produtos_vendaDao();
		produtos_vendaDAO.voltar(produtos_venda);
	}
	
}


