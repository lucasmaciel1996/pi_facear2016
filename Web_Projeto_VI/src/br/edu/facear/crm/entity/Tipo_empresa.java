package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TAB_TIPO_EMPRESA")
public class Tipo_empresa {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long tipo_empresa_id;
	private String descricao;
	public Long getTipo_empresa_id() {
		return tipo_empresa_id;
	}
	public void setTipo_empresa_id(Long tipo_empresa_id) {
		this.tipo_empresa_id = tipo_empresa_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Tipo_empresa [tipo_empresa_id=" + tipo_empresa_id + ", descricao=" + descricao + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((tipo_empresa_id == null) ? 0 : tipo_empresa_id.hashCode());
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
		Tipo_empresa other = (Tipo_empresa) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (tipo_empresa_id == null) {
			if (other.tipo_empresa_id != null)
				return false;
		} else if (!tipo_empresa_id.equals(other.tipo_empresa_id))
			return false;
		return true;
	}
	public Tipo_empresa(Long tipo_empresa_id, String descricao) {
		super();
		this.tipo_empresa_id = tipo_empresa_id;
		this.descricao = descricao;
	}
	public Tipo_empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
}