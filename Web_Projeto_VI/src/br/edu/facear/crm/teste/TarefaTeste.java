package br.edu.facear.crm.teste;

import java.text.DateFormat;
import java.util.Date;

import br.edu.facear.crm.dao.TarefaDao;
import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Origem_contato;
import br.edu.facear.crm.entity.Prioridade;
import br.edu.facear.crm.entity.Tarefa;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.facade.Facade;

public class TarefaTeste {

	public static void main(String[] args) {

		CadastrarTarefa();
	}



	private static void CadastrarTarefa() {

		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("xxxx");
		
	

		DateFormat data_venda = DateFormat.getDateInstance();
		Date data_inicio = new Date();

		Empresa empresa = new Empresa();
		empresa.setNome_contato("CESAR");
		tarefa.setEmpresa(empresa);

		Origem_contato origem_contato = new Origem_contato();
		origem_contato.setDescricao("Telefone");

		tarefa.setOrigem_contato(origem_contato);

		tarefa.setData_inicio(data_inicio);

		Prioridade prioridade = new Prioridade();
		prioridade.setDescricao("2 Alta");
		tarefa.setPrioridade(prioridade);

		Usuario usuario = new Usuario();
		usuario.setUsuario_nome("MARIANE");
		tarefa.setUsuario(usuario);


	   Facade facade= new Facade();
	   
	  // TarefaDao  dao= new TarefaDao();
	 //  dao.Salvar(tarefa);
	   
	  facade.salvarTarefa(tarefa);
	      

	
	}
}
