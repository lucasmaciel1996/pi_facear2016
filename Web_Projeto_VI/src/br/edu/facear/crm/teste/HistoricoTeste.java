package br.edu.facear.crm.teste;

import br.edu.facear.crm.dao.TarefaDao;
import br.edu.facear.crm.entity.Tarefa;

public class HistoricoTeste {
	
	public static void main(String[] args) {
		ConsultaTarefa();
	}

	
	@SuppressWarnings("unused")
	private static void ConsultaTarefa() {
		
	TarefaDao tarefadao = new TarefaDao();
	Tarefa tarefa = new Tarefa();
	
	tarefadao.listar();
	

	
	
	}
	
	
	
	
}
