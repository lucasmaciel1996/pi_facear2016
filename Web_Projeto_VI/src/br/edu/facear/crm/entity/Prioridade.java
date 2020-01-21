package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_PRIORIDADE")
	
public class Prioridade {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	private Long prioridade_id;
	private String descricao;
	
	public Long getPrioridade_id() {
		return prioridade_id;
	}
	public void setPrioridade_id(Long prioridade_id) {
		this.prioridade_id = prioridade_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Prioridade [prioridade_id=" + prioridade_id + ", descricao=" + descricao + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((prioridade_id == null) ? 0 : prioridade_id.hashCode());
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
		Prioridade other = (Prioridade) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (prioridade_id == null) {
			if (other.prioridade_id != null)
				return false;
		} else if (!prioridade_id.equals(other.prioridade_id))
			return false;
		return true;
	}
	public Prioridade(Long prioridade_id, String descricao) {
		super();
		this.prioridade_id = prioridade_id;
		this.descricao = descricao;
	}
	public Prioridade() {
		super();
		// TODO Auto-generated constructor stub
	}

}
