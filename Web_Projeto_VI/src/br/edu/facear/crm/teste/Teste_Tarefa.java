package br.edu.facear.crm.teste;

import br.edu.facear.crm.entity.Tarefa;
import br.edu.facear.crm.facade.Facade;

public class Teste_Tarefa {

	public static void main(String[] args) {
		cadastrarTarefa();

	}

	private static void cadastrarTarefa() {
		Tarefa tarefa= new Tarefa();
		Facade facade = new Facade();
		
		tarefa.setDescricao("TAREFA");
		
		
		facade.salvarTarefa(tarefa);
		
		
		
		
		
	}

}
