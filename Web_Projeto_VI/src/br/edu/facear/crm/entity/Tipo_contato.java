package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "TAB_TIPO_CONTATO")
public class Tipo_contato {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long tipo_contato_id;
	private String descricao;
	
	
	
	
	public Long getTipo_contato_id() {
		return tipo_contato_id;
	}
	public void setTipo_contato_id(Long tipo_contato_id) {
		this.tipo_contato_id = tipo_contato_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Tipo_de_contato [tipo_contato_id=" + tipo_contato_id
				+ ", descricao=" + descricao + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((tipo_contato_id == null) ? 0 : tipo_contato_id.hashCode());
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
		Tipo_contato other = (Tipo_contato) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (tipo_contato_id == null) {
			if (other.tipo_contato_id != null)
				return false;
		} else if (!tipo_contato_id.equals(other.tipo_contato_id))
			return false;
		return true;
	}
	public Tipo_contato(Long tipo_contato_id, String descricao) {
		super();
		this.tipo_contato_id = tipo_contato_id;
		this.descricao = descricao;
	}
	public Tipo_contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
