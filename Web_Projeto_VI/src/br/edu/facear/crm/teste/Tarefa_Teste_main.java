package br.edu.facear.crm.teste;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Origem_contato;
import br.edu.facear.crm.entity.Prioridade;
import br.edu.facear.crm.entity.Situacao;
import br.edu.facear.crm.entity.Tarefa;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.facade.Facade;

public class Tarefa_Teste_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CadastrarTarefa();
	}

	private static void CadastrarTarefa(){
		  
		Tarefa tarefa = new Tarefa();
		
		@SuppressWarnings("unused")
		DateFormat data = DateFormat.getDateInstance();
		Date data_inicio = new Date();
		
		Empresa empresa = new Empresa();
		empresa.setEmpresa_id(1L);
		tarefa.setEmpresa(empresa);
		
		Origem_contato origem_contato = new Origem_contato();
		origem_contato.setOrigem_contato_id(2L);
		tarefa.setOrigem_contato(origem_contato);
		
		tarefa.setDescricao("Instalar o word");
		
		tarefa.setData_inicio(data_inicio);
		
		Prioridade prioridade = new Prioridade();
		prioridade.setPrioridade_id(3L);
		tarefa.setPrioridade(prioridade);
		
		Usuario usuario = new Usuario();
		usuario.setUsuario_id(2L);
		tarefa.setUsuario(usuario);
		
		Situacao situacao = new Situacao();
		situacao.setSituacao_id(1L);
		tarefa.setSituacao(situacao);
		
		tarefa.setSolucao("Aguardando solução");
		
		Facade facade = new Facade();
		facade.salvarTarefa(tarefa);
		
		tarefa = new Tarefa();
		
		tarefa.setEmpresa(empresa);
		
		tarefa.setOrigem_contato(origem_contato);
		
		tarefa.setDescricao("Trocar cabos de rede");
		
		tarefa.setData_inicio(data_inicio);
		
		tarefa.setPrioridade(prioridade);
		
		tarefa.setUsuario(usuario);
		
		tarefa.setSituacao(situacao);
		
		tarefa.setSolucao("Aguardando solução");
		
		facade = new Facade();
		facade.salvarTarefa(tarefa);
		
		System.out.println(" Tarefa cadastradas " + tarefa);
		
	}
	
	

}
	
