package br.edu.facear.crm.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "TAB_Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuario_id;
	private String usuario_nome;
	private String usuario_senha;
	//Venda venda = new Venda();
	
	public Long getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getUsuario_nome() {
		return usuario_nome;
	}
	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}
	public String getUsuario_senha() {
		return usuario_senha;
	}
	public void setUsuario_senha(String usuario_senha) {
		this.usuario_senha = usuario_senha;
	}
	
	@Override
	public String toString() {
		return "Usuario [usuario_id=" + usuario_id + ", usuario_nome=" + usuario_nome + ", usuario_senha="
				+ usuario_senha + ", dataLogin=" + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario_id == null) ? 0 : usuario_id.hashCode());
		result = prime * result + ((usuario_nome == null) ? 0 : usuario_nome.hashCode());
		result = prime * result + ((usuario_senha == null) ? 0 : usuario_senha.hashCode());
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
		Usuario other = (Usuario) obj;
		if (usuario_id == null) {
			if (other.usuario_id != null)
				return false;
		} else if (!usuario_id.equals(other.usuario_id))
			return false;
		if (usuario_nome == null) {
			if (other.usuario_nome != null)
				return false;
		} else if (!usuario_nome.equals(other.usuario_nome))
			return false;
		if (usuario_senha == null) {
			if (other.usuario_senha != null)
				return false;
		} else if (!usuario_senha.equals(other.usuario_senha))
			return false;
		return true;
	}
	public Usuario(Long usuario_id, String usuario_nome, String usuario_senha, Date dataLogin) {
		super();
		this.usuario_id = usuario_id;
		this.usuario_nome = usuario_nome;
		this.usuario_senha = usuario_senha;
		
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
