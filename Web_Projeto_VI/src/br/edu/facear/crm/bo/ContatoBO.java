package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.ContatoDao;
import br.edu.facear.crm.dao.Tipo_contatoDao;
import br.edu.facear.crm.entity.Contato;
import br.edu.facear.crm.entity.Tipo_contato;

public class ContatoBO {
	
	public void salvar(Contato contato){	
		ContatoDao contatoDao = new ContatoDao();
		contatoDao.Salvar(contato);		
	}
	
	public List<Contato> listar() {
		ContatoDao contatoDAO = new ContatoDao();;
		return contatoDAO.listar();
	}
	
	public void editar(Contato contato) {
		ContatoDao contatoDAO = new ContatoDao();
		contatoDAO.editar(contato);
	}

	public Contato getObjectById(Long id) {		
		ContatoDao contatoDao = new ContatoDao();;
		return contatoDao.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		ContatoDao contatoDAO = new ContatoDao();
		contatoDAO.excluir(id);
	}
	
	public void novo(Contato contato) {
		ContatoDao contatoDAO = new ContatoDao();
		contatoDAO.novo(contato);
	}
	
	public void voltar(Contato contato) {
		ContatoDao contatoDAO = new ContatoDao();
		contatoDAO.voltar(contato);
	}
	


}
