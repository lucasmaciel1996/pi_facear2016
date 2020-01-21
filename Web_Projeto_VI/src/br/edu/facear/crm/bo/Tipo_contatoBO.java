package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.Tipo_contatoDao;
import br.edu.facear.crm.entity.Tipo_contato;



public class Tipo_contatoBO {
	
	
	
	public void salvar(Tipo_contato tipo_contato){	
		Tipo_contatoDao tipo_contatoDao = new Tipo_contatoDao();
		tipo_contatoDao.Salvar(tipo_contato);		
	}
	
	public List<Tipo_contato> listar() {
		Tipo_contatoDao tipo_contatoDAO = new Tipo_contatoDao();;
		return tipo_contatoDAO.listar();
	}
	
	public void editar(Tipo_contato tipo_contato) {
		Tipo_contatoDao tipo_contatoDAO = new Tipo_contatoDao();
		tipo_contatoDAO.editar(tipo_contato);
	}

	public Tipo_contato getObjectById(Long id) {		
		Tipo_contatoDao tipo_contatoDao = new Tipo_contatoDao();;
		return tipo_contatoDao.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		Tipo_contatoDao tipo_contatoDAO = new Tipo_contatoDao();
		tipo_contatoDAO.excluir(id);
	}
	
	public void novo(Tipo_contato tipo_contato) {
		Tipo_contatoDao tipo_contatoDAO = new Tipo_contatoDao();
		tipo_contatoDAO.novo(tipo_contato);
	}
	
	public void voltar(Tipo_contato tipo_contato) {
		Tipo_contatoDao tipo_contatoDAO = new Tipo_contatoDao();
		tipo_contatoDAO.voltar(tipo_contato);
	}
	

}
