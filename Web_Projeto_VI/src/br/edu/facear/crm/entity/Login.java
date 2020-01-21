package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_LOGIN")

public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_login;
	private String login;
	private String senha;

	public Long getId_login() {
		return id_login;
	}

	public void setId_login(Long id_login) {
		this.id_login = id_login;
	}

	public String getLogin() {
		return login;
	}

	@Override
	public String toString() {
		// return "Login [login=" + login + ", senha=" + senha + "]";

		return "Login:" + login + "  Senha:" + senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}