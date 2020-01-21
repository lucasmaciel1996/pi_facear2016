package br.edu.facear.crm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import br.edu.facear.crm.dao.LoginDao;
import br.edu.facear.crm.entity.Login;
import br.edu.facear.crm.facade.Facade;

@ManagedBean(name = "beanLogin")
@RequestScoped
public class BeanLogin {

	private Login login;
	private String conf_senha;

	public String getConf_senha() {
		return conf_senha;
	}

	public void setConf_senha(String conf_senha) {
		this.conf_senha = conf_senha;
	}

	private ArrayList<Login> logins;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public BeanLogin() {
		login = new Login();

	}

	public ArrayList<Login> getLogins() {
		this.logins = new ArrayList<Login>();
		LoginDao logindao = new LoginDao();
		this.logins = (ArrayList<Login>) logindao.listar();

		return logins;
	}

	public void setLogins(ArrayList<Login> logins) {

		this.logins = logins;
	}

	public String novo() {
		return "CADASTRAR_LOGIN.xhtml";

	}



	public String salvar() {

		LoginDao logindao = new LoginDao(); //
		List<Login> logins =logindao.ValidarLogin(login);

		// logs.size verifica no banco se ja nao existe um login cadastrado
		// igual

		// faz validacao entre senha e confirmacao da senha

		if (conf_senha.equals(login.getSenha()) && (logins.size() == 0)) {

			 System.out.println("ID salva: " + login.getId_login());

			if ((login.getId_login() == null) && (logins.size() == 0)) {

				Facade facade = new Facade();

				facade.salvarLogin(login);

				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Realize o Login", "SALVO COM SUCESSO"));
			} else {
				Facade facade = new Facade();
				System.out.println("ID altera: " + login.getId_login());
				facade.editarLogin(login);
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, "", "ALTERADA COM SUCESSO"));

			}

			return "TELA_LOGIN.xhtml";
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "SENHA INVALIDAS ", "Digite Novamente"));

			return "CADASTRAR_LOGIN.xhtml";
		}

	}

	public String logar() {
		LoginDao logindao = new LoginDao();

		List<Login> logins = logindao.ValidarLogin(login);

		if (logins.size() == 1) {

			return "PAGINA_PRINCIPAL.xhtml";

		} else {
			login = new Login();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou senha Invalido ", "Login Invalido "));

			return "TELA_LOGIN.xhtml";
		}

	}

	public String Editar(Login login) {
		this.login = login;
		 FacesContext.getCurrentInstance().addMessage(null,
		 new FacesMessage(FacesMessage.SEVERITY_INFO, "Alterar Login", ""));

		return "CADASTRAR_LOGIN.xhtml";
	}

	public String Excluir(Login login) {
		Facade facade = new Facade();
		facade.excluirLogin(login.getId_login());

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "EXCLUIDA COM SUCESSO"));

		return "CONSULTA_LOGIN.xhtml";

	}
}
