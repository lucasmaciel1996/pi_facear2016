package br.edu.facear.crm.bo;


import java.util.List;

import br.edu.facear.crm.dao.Origem_contatoDao;
import br.edu.facear.crm.entity.Origem_contato;

public class Origem_contatoBO {
	
	public void salvar(Origem_contato origem_contato){	
		Origem_contatoDao origem_contatoDao = new Origem_contatoDao();
		origem_contatoDao.Salvar(origem_contato);		
	}
	
	public List<Origem_contato> listar() {
		Origem_contatoDao origem_contatoDAO = new Origem_contatoDao();;
		return origem_contatoDAO.listar();
	}
	
	public void editar(Origem_contato origem_contato) {
		Origem_contatoDao origem_contatoDAO = new Origem_contatoDao();
		origem_contatoDAO.editar(origem_contato);
	}

	public Origem_contato getObjectById(Long id) {		
		Origem_contatoDao origem_contatoDao = new Origem_contatoDao();;
		return origem_contatoDao.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		Origem_contatoDao origem_contatoDAO = new Origem_contatoDao();
		origem_contatoDAO.excluir(id);
	}
	
	public void novo(Origem_contato origem_contato) {
		Origem_contatoDao origem_contatoDAO = new Origem_contatoDao();
		origem_contatoDAO.novo(origem_contato);
	}
	
	public void voltar(Origem_contato origem_contato) {
		Origem_contatoDao origem_contatoDAO = new Origem_contatoDao();
		origem_contatoDAO.voltar(origem_contato);
	}
	
}
