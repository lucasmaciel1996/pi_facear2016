package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.TarefaDao;
import br.edu.facear.crm.entity.Tarefa;

public class TarefaBO {

	public void salvar(Tarefa tarefa) {
		TarefaDao tarefaDAO = new TarefaDao();
		tarefaDAO.Salvar(tarefa);
	}

	public List<Tarefa> listar() {
		TarefaDao tarefaDAO = new TarefaDao();
		return tarefaDAO.listar();
	}

	public void editar(Tarefa tarefa) {
		TarefaDao tarefaDAO = new TarefaDao();
		tarefaDAO.editar(tarefa);
	}

	public Tarefa getObjectById(Long id) {
		TarefaDao tarefaDAO = new TarefaDao();
		return tarefaDAO.getObjectById(id);
	}

	public void excluir(Long id) {
		TarefaDao tarefaDAO = new TarefaDao();
		tarefaDAO.excluir(id);
	}


}
