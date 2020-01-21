package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.PrioridadeDao;
import br.edu.facear.crm.entity.Prioridade;

public class PrioridadeBO {
	
	public void salvar(Prioridade prioridade){	
		PrioridadeDao prioridadeDAO = new PrioridadeDao();
		prioridadeDAO.Salvar(prioridade);		
	}
	
	public List<Prioridade> listar() {
		PrioridadeDao prioridadeDAO = new PrioridadeDao();
		return prioridadeDAO.listar();
	}
	
	public void editar(Prioridade prioridade) {
		PrioridadeDao prioridadeDAO = new PrioridadeDao();
		prioridadeDAO.editar(prioridade);
	}

	public Prioridade Prioridade(Long id) {		
		PrioridadeDao prioridadeDAO = new PrioridadeDao();
		return prioridadeDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		PrioridadeDao prioridadeDAO = new PrioridadeDao();
		prioridadeDAO.excluir(id);
	}
	
	public void novo(Prioridade prioridade) {
		PrioridadeDao prioridadeDAO = new PrioridadeDao();
		prioridadeDAO.novo(prioridade);
	}
	
	public void voltar(Prioridade prioridade) {
		PrioridadeDao prioridadeDAO = new PrioridadeDao();
		prioridadeDAO.voltar(prioridade);
	}

	public Prioridade getObjectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
