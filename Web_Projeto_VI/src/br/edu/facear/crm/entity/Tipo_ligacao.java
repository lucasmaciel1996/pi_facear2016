package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_TIPO_LIGACAO")
public class Tipo_ligacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tipo_ligacao_id;
	private String Descricao;

	public Long getTipo_ligacao_id() {
		return tipo_ligacao_id;
	}

	public void setTipo_ligacao_id(Long tipo_ligacao_id) {
		this.tipo_ligacao_id = tipo_ligacao_id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descricao == null) ? 0 : Descricao.hashCode());
		result = prime * result + ((tipo_ligacao_id == null) ? 0 : tipo_ligacao_id.hashCode());
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
		Tipo_ligacao other = (Tipo_ligacao) obj;
		if (Descricao == null) {
			if (other.Descricao != null)
				return false;
		} else if (!Descricao.equals(other.Descricao))
			return false;
		if (tipo_ligacao_id == null) {
			if (other.tipo_ligacao_id != null)
				return false;
		} else if (!tipo_ligacao_id.equals(other.tipo_ligacao_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tipo_ligacao [tipo_ligacao_id=" + tipo_ligacao_id + ", Descricao=" + Descricao + "]";
	}

}
