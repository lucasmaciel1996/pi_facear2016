package br.edu.facear.crm.teste;

import java.util.List;

import br.edu.facear.crm.dao.LoginDao;
import br.edu.facear.crm.entity.Login;
import br.edu.facear.crm.facade.Facade;

public class Teste_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CadastrarLogin();
		
		Login login = new Login();
		
		login.setLogin("Cesar");
		login.setSenha("1234");
		
		
		LoginDao logindao = new LoginDao();
		
		List<Login> logins = logindao.ValidarLogin(login);

		System.out.println("Tamanho:" + logins.size());
	       for (Login log : logins) { System.out.println("--"+log); }
		 

		if (logins.size() == 1) {
			Login log = logins.get(0);
			System.out.println("Achou o usuario:" + log);
		} else {
			System.out.println("Nao encontrado");
		}
		
		
	} 
	
public static void CadastrarLogin(){
		
		Login login = new Login();
		
		login.setLogin("João");
		login.setSenha("aaaa");
		
		Facade facade = new Facade();
		facade.salvarLogin(login);
	
		System.out.println("CADASTROU");
		
		
	}
}
	


