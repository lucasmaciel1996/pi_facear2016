package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.LoginDao;
import br.edu.facear.crm.entity.Login;

public class LoginBO {

	public void salvar(Login login){	
		LoginDao logindao = new LoginDao();
		logindao.Salvar(login);		
	}

	public List<Login> listar() {
		LoginDao logindao = new LoginDao();;
		return logindao.listar();
	}
	
	public void editar(Login login) {
		LoginDao logindao = new LoginDao();
		logindao.editar(login);
	}

	public Login getObjectBySenha(Long id) {		
		LoginDao logindao = new LoginDao();
		return logindao.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		LoginDao logindao = new LoginDao();
		logindao.excluir(id);
	}
	
	public void novo(Login login) {
		LoginDao logindao = new LoginDao();
		logindao.novo(login);
	}
	
	public void voltar(Login login) {
		LoginDao logindao = new LoginDao();
		logindao.voltar(login);
	}
	
	
	
	
}
