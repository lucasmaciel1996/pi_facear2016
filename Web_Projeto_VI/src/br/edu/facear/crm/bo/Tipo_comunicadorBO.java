package br.edu.facear.crm.bo;


import java.util.List;

import br.edu.facear.crm.dao.Tipo_comunicadorDao;
import br.edu.facear.crm.entity.Tipo_comunicador;

public class Tipo_comunicadorBO {
	
	public void salvar(Tipo_comunicador tipo_comunicador){	
		Tipo_comunicadorDao tipo_comunicadorDao = new Tipo_comunicadorDao();
		tipo_comunicadorDao.Salvar(tipo_comunicador);		
	}
	
	public List<Tipo_comunicador> listar() {
		Tipo_comunicadorDao tipo_comunicadorDAO = new Tipo_comunicadorDao();;
		return tipo_comunicadorDAO.listar();
	}
	
	public void editar(Tipo_comunicador tipo_comunicador) {
		Tipo_comunicadorDao tipo_comunicadorDAO = new Tipo_comunicadorDao();
		tipo_comunicadorDAO.editar(tipo_comunicador);
	}
	public Tipo_comunicador getObjectById(Long id) {		
		Tipo_comunicadorDao tipo_comunicadorDao = new Tipo_comunicadorDao();;
		return tipo_comunicadorDao.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		Tipo_comunicadorDao tipo_comunicadorDAO = new Tipo_comunicadorDao();
		tipo_comunicadorDAO.excluir(id);
	}
	
	public void novo(Tipo_comunicador tipo_comunicador) {
		Tipo_comunicadorDao tipo_comunicadorDAO = new Tipo_comunicadorDao();
		tipo_comunicadorDAO.novo(tipo_comunicador);
	}
	
	public void voltar(Tipo_comunicador tipo_comunicador) {
		Tipo_comunicadorDao tipo_comunicadorDAO = new Tipo_comunicadorDao();
		tipo_comunicadorDAO.voltar(tipo_comunicador);
	}
	
	
	}
	
	
	
	
	




