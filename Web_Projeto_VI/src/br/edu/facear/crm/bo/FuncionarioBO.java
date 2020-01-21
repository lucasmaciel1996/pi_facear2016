package br.edu.facear.crm.bo;


import java.util.List;

import br.edu.facear.crm.dao.FuncionarioDao;
import br.edu.facear.crm.entity.Funcionario;


public class FuncionarioBO {
	
	
	public void salvar(Funcionario funcionario){	
		FuncionarioDao funcionarioDAO = new FuncionarioDao();
		funcionarioDAO.Salvar(funcionario);		
	}
	
	public List<Funcionario> listar() {
		FuncionarioDao funcionarioDAO = new FuncionarioDao();
		return funcionarioDAO.listar();
	}
	
	public void editar(Funcionario funcionario) {
		FuncionarioDao funcionarioDAO = new FuncionarioDao();
		funcionarioDAO.editar(funcionario);
	}

	public Funcionario getObjectById(Long id) {		
		FuncionarioDao funcionarioDAO = new FuncionarioDao();
		return funcionarioDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		FuncionarioDao funcionarioDAO = new FuncionarioDao();
		funcionarioDAO.excluir(id);
	}
	
	public void novo(Funcionario funcionario) {
		FuncionarioDao funcionarioDAO = new FuncionarioDao();
		funcionarioDAO.novo(funcionario);
	}
	
	public void voltar(Funcionario funcionario) {
		FuncionarioDao funcionarioDAO = new FuncionarioDao();
		funcionarioDAO.voltar(funcionario);
	}
	
}