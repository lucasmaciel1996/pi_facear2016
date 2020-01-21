package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.VendaDao;
import br.edu.facear.crm.entity.Venda;


public class VendaBO {
	
	public void salvar(Venda venda){	
		VendaDao vendaDAO = new VendaDao();
		vendaDAO.Salvar(venda);		
	}
	
	public List<Venda> listar() {
		VendaDao vendaDAO = new VendaDao();
		return vendaDAO.listar();
	}
	
	public void editar(Venda venda) {
		VendaDao vendaDAO = new VendaDao();
		vendaDAO.editar(venda);
	}

	public Venda getObjectById(Long id) {		
		VendaDao vendaDAO = new VendaDao();
		return vendaDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		VendaDao vendaDAO = new VendaDao();
		vendaDAO.excluir(id);
	}
	
	public void novo(Venda venda) {
		VendaDao vendaDAO = new VendaDao();
		vendaDAO.novo(venda);
	}
	
	public void voltar(Venda venda) {
		VendaDao vendaDAO = new VendaDao();
		vendaDAO.voltar(venda);
	}
	
}
