package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "TAB_SITUACAO")
public class Situacao {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long situacao_id;
	private String descricao;
	
	public Long getSituacao_id() {
		return situacao_id;
	}
	public void setSituacao_id(Long situacao_id) {
		this.situacao_id = situacao_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((situacao_id == null) ? 0 : situacao_id.hashCode());
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
		Situacao other = (Situacao) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (situacao_id == null) {
			if (other.situacao_id != null)
				return false;
		} else if (!situacao_id.equals(other.situacao_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Situacao [situacao_id=" + situacao_id + ", descricao="
				+ descricao + "]";
	}
	public Situacao(Long situacao_id, String descricao) {
		super();
		this.situacao_id = situacao_id;
		this.descricao = descricao;
	}
	public Situacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
