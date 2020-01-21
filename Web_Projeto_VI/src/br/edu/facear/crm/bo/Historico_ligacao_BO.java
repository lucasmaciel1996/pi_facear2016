package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.Historico_Ligacao_Dao;
import br.edu.facear.crm.entity.Historico_ligacao;

public class Historico_ligacao_BO {


	public void salvar(Historico_ligacao historico){	
		Historico_Ligacao_Dao historico_DAO= new Historico_Ligacao_Dao();
		historico_DAO.Salvar(historico);		
	}
	
	public List<Historico_ligacao > listar() {
		Historico_Ligacao_Dao historico_DAO= new Historico_Ligacao_Dao();
		
		return historico_DAO.listar();
	}
	
	public void editar(Historico_ligacao historico) {
		Historico_Ligacao_Dao historico_DAO= new Historico_Ligacao_Dao();
		historico_DAO.editar(historico);
	}

	public Historico_ligacao getObjectById(Long id) {		
		Historico_Ligacao_Dao historico_DAO= new Historico_Ligacao_Dao();
		return historico_DAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		Historico_Ligacao_Dao historico_DAO= new Historico_Ligacao_Dao();
	historico_DAO.excluir(id);
	}
	


}
