package br.edu.facear.crm.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TAB_TIPO_COMUNICADOR")
public class Tipo_comunicador {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long tipo_comunicador_id;
	@Column
	private String tipo_comunicador_descricao;
	@Override
	public String toString() {
		return "Tipo_comunicador [tipo_comunicador_id=" + tipo_comunicador_id + ", tipo_comunicador_descricao="
				+ tipo_comunicador_descricao + "]";
	}
	public Tipo_comunicador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo_comunicador(Long tipo_omunicador_id,
			String tipo_comunicador_descricao) {
		super();
		this.tipo_comunicador_id = tipo_omunicador_id;
		this.tipo_comunicador_descricao = tipo_comunicador_descricao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo_comunicador_descricao == null) ? 0 : tipo_comunicador_descricao.hashCode());
		result = prime * result + ((tipo_comunicador_id == null) ? 0 : tipo_comunicador_id.hashCode());
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
		Tipo_comunicador other = (Tipo_comunicador) obj;
		if (tipo_comunicador_descricao == null) {
			if (other.tipo_comunicador_descricao != null)
				return false;
		} else if (!tipo_comunicador_descricao.equals(other.tipo_comunicador_descricao))
			return false;
		if (tipo_comunicador_id == null) {
			if (other.tipo_comunicador_id != null)
				return false;
		} else if (!tipo_comunicador_id.equals(other.tipo_comunicador_id))
			return false;
		return true;
	}
	
	public Long getTipo_comunicador_id() {
		return tipo_comunicador_id;
	}
	public void setTipo_comunicador_id(Long tipo_comunicador_id) {
		this.tipo_comunicador_id = tipo_comunicador_id;
	}
	public String getTipo_comunicador_descricao() {
		return tipo_comunicador_descricao;
	}
	public void setTipo_comunicador_descricao(String tipo_comunicador_descricao) {
		this.tipo_comunicador_descricao = tipo_comunicador_descricao;
	}

}
