package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.Historico_Ligacao_Dao;
import br.edu.facear.crm.dao.Tipo_ligacao_DAO;
import br.edu.facear.crm.entity.Historico_ligacao;
import br.edu.facear.crm.entity.Tipo_ligacao;

public class Tipo_Ligacao_BO {
	
	public void salvar(Tipo_ligacao tipo_ligacao) {
		Tipo_ligacao_DAO tipo_ligacao_DAO = new Tipo_ligacao_DAO();
		
	  tipo_ligacao_DAO.Salvar(tipo_ligacao);
	}

	public List<Tipo_ligacao> listar() {
		Tipo_ligacao_DAO tipo_ligacao_DAO = new Tipo_ligacao_DAO();

		return tipo_ligacao_DAO.listar();
	}

	public void editar(Tipo_ligacao tipo_ligacao) {
		Tipo_ligacao_DAO tipo_ligacao_DAO = new Tipo_ligacao_DAO();
		tipo_ligacao_DAO.editar(tipo_ligacao);
	}

	public Tipo_ligacao  getObjectById(Long id) {
		Tipo_ligacao_DAO tipo_ligacao_DAO = new Tipo_ligacao_DAO();
		return tipo_ligacao_DAO.getObjectById(id);
	}

	public void excluir(Long id) {
		Tipo_ligacao_DAO tipo_ligacao_DAO = new Tipo_ligacao_DAO();
		tipo_ligacao_DAO.excluir(id);
	}

}
