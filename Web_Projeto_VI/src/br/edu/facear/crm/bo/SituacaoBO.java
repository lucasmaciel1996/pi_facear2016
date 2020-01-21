package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.SituacaoDao;
import br.edu.facear.crm.entity.Situacao;
public class SituacaoBO {
	
	public void salvar(Situacao situacao){	
		SituacaoDao situacaoDAO = new SituacaoDao();
		situacaoDAO.Salvar(situacao);		
	}
	
	public List<Situacao> listar() {
		SituacaoDao situacaoDAO = new SituacaoDao();
		return situacaoDAO.listar();
	}
	
	public void editar(Situacao situacao) {
		SituacaoDao situacaoDAO = new SituacaoDao();
		situacaoDAO.editar(situacao);
	}

	public Situacao getObjectById(Long id) {		
		SituacaoDao situacaoDAO = new SituacaoDao();
		return situacaoDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		SituacaoDao situacaoDAO = new SituacaoDao();
		situacaoDAO.excluir(id);
	}
	
	public void novo(Situacao situacao) {
		SituacaoDao situacaoDAO = new SituacaoDao();
		situacaoDAO.novo(situacao);
	}
	
	public void voltar(Situacao situacao) {
		SituacaoDao situacaoDAO = new SituacaoDao();
		situacaoDAO.voltar(situacao);
	}
	
}

