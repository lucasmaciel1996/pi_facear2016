package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TAB_TIPO_TELEFONE")
public class Tipo_telefone {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long tipo_telefone_id;
	private String descricao;
	
	
	public Long getTipo_telefone_id() {
		return tipo_telefone_id;
	}
	public void setTipo_telefone_id(Long tipo_telefone_id) {
		this.tipo_telefone_id = tipo_telefone_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Tipo_telefone [tipo_telefone_id=" + tipo_telefone_id + ", descricao=" + descricao + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((tipo_telefone_id == null) ? 0 : tipo_telefone_id.hashCode());
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
		Tipo_telefone other = (Tipo_telefone) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (tipo_telefone_id == null) {
			if (other.tipo_telefone_id != null)
				return false;
		} else if (!tipo_telefone_id.equals(other.tipo_telefone_id))
			return false;
		return true;
	}
	public Tipo_telefone(Long tipo_telefone_id, String descricao) {
		super();
		this.tipo_telefone_id = tipo_telefone_id;
		this.descricao = descricao;
	}
	public Tipo_telefone() {
		super();
		// TODO Auto-generated constructor stub
	}
}
