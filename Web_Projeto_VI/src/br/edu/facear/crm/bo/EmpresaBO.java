package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.EmpresaDao;
import br.edu.facear.crm.entity.Empresa;


public class EmpresaBO {
	

	public void salvar(Empresa empresa){	
		EmpresaDao empresaDAO = new EmpresaDao();
		empresaDAO.Salvar(empresa);		
	}
	
	public List<Empresa> listar() {
		EmpresaDao empresaDAO = new EmpresaDao();
		return empresaDAO.listar();
	}
	
	public void editar(Empresa empresa) {
		EmpresaDao empresaDAO = new EmpresaDao();
		empresaDAO.editar(empresa);
	}

	public Empresa getObjectById(Long id) {		
		EmpresaDao empresaDAO = new EmpresaDao();
		return empresaDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		EmpresaDao empresaDAO = new EmpresaDao();
		empresaDAO.excluir(id);
	}
	
	public void novo(Empresa empresa) {
		EmpresaDao empresaDAO = new EmpresaDao();
		empresaDAO.novo(empresa);
	}
	
	public void voltar(Empresa empresa) {
		EmpresaDao empresaDAO = new EmpresaDao();
		empresaDAO.voltar(empresa);
	}
	
}
