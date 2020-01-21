package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TAB_ORIGEM_CONTATO")
public class Origem_contato {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long origem_contato_id;
	private String descricao;
	
	public Long getOrigem_contato_id() {
		return origem_contato_id;
	}
	public void setOrigem_contato_id(Long origem_contato_id) {
		this.origem_contato_id = origem_contato_id;
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
		result = prime
				* result
				+ ((origem_contato_id == null) ? 0 : origem_contato_id
						.hashCode());
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
		Origem_contato other = (Origem_contato) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (origem_contato_id == null) {
			if (other.origem_contato_id != null)
				return false;
		} else if (!origem_contato_id.equals(other.origem_contato_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Origem_contato [origem_contato_id=" + origem_contato_id
				+ ", descricao=" + descricao + "]";
	}
	public Origem_contato(Long origem_contato_id, String descricao) {
		super();
		this.origem_contato_id = origem_contato_id;
		this.descricao = descricao;
	}
	public Origem_contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
