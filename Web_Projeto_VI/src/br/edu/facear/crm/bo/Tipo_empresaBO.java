package br.edu.facear.crm.bo;

import java.util.List;
import br.edu.facear.crm.dao.Tipo_empresaDao;
import br.edu.facear.crm.entity.Tipo_empresa;

public class Tipo_empresaBO {

	
	public void salvar(Tipo_empresa tipo_empresa){	
		Tipo_empresaDao tipo_empresaDao = new Tipo_empresaDao();
		tipo_empresaDao.Salvar(tipo_empresa);		
	}
	
	public List<Tipo_empresa> listar() {
		Tipo_empresaDao tipo_empresaDAO = new Tipo_empresaDao();;
		return tipo_empresaDAO.listar();
	}
	
	public void editar(Tipo_empresa tipo_empresa) {
		Tipo_empresaDao tipo_empresaDAO = new Tipo_empresaDao();
		tipo_empresaDAO.editar(tipo_empresa);
	}

	public Tipo_empresa getObjectById(Long id) {		
		Tipo_empresaDao tipo_empresaDao = new Tipo_empresaDao();;
		return tipo_empresaDao.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		Tipo_empresaDao tipo_empresaDAO = new Tipo_empresaDao();
		tipo_empresaDAO.excluir(id);
	}
	
	public void novo(Tipo_empresa tipo_empresa) {
		Tipo_empresaDao tipo_empresaDAO = new Tipo_empresaDao();
		tipo_empresaDAO.novo(tipo_empresa);
	}
	
	public void voltar(Tipo_empresa tipo_empresa) {
		Tipo_empresaDao tipo_empresaDAO = new Tipo_empresaDao();
		tipo_empresaDAO.voltar(tipo_empresa);
	}
	

}


