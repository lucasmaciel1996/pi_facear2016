package br.edu.facear.crm.bo;


import java.util.List;

import br.edu.facear.crm.dao.Tipo_telefoneDao;
import br.edu.facear.crm.entity.Tipo_telefone;

public class Tipo_telefoneBO {
	
	public void salvar(Tipo_telefone tipo_telefone){	
		Tipo_telefoneDao tipo_telefoneDao = new Tipo_telefoneDao();
		tipo_telefoneDao.Salvar(tipo_telefone);		
	}
	
	public List<Tipo_telefone> listar() {
		Tipo_telefoneDao tipo_telefoneDAO = new Tipo_telefoneDao();;
		return tipo_telefoneDAO.listar();
	}
	
	public void editar(Tipo_telefone tipo_telefone) {
		Tipo_telefoneDao tipo_telefoneDAO = new Tipo_telefoneDao();
		tipo_telefoneDAO.editar(tipo_telefone);
	}

	public Tipo_telefone getObjectById(Long id) {		
		Tipo_telefoneDao tipo_telefoneDao = new Tipo_telefoneDao();;
		return tipo_telefoneDao.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		Tipo_telefoneDao tipo_telefoneDAO = new Tipo_telefoneDao();
		tipo_telefoneDAO.excluir(id);
	}
	
	public void novo(Tipo_telefone tipo_telefone) {
		Tipo_telefoneDao tipo_telefoneDAO = new Tipo_telefoneDao();
		tipo_telefoneDAO.novo(tipo_telefone);
	}
	
	public void voltar(Tipo_telefone tipo_telefone) {
		Tipo_telefoneDao tipo_telefoneDAO = new Tipo_telefoneDao();
		tipo_telefoneDAO.voltar(tipo_telefone);
	}
	
}
