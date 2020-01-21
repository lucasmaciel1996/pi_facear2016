package br.edu.facear.crm.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_HISTORICO_LIGACAO")
public class Historico_ligacao {
	// cria classe tipo ligacao
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long historico_id;
	private String descricao;
	private Date data;

	@ManyToOne
	private Tipo_ligacao tipo_ligacao;

	public Tipo_ligacao getTipo_ligacao() {
		return tipo_ligacao;
	}

	public void setTipo_ligacao(Tipo_ligacao tipo_ligacao) {
		this.tipo_ligacao = tipo_ligacao;
	}

	@ManyToOne
	private Empresa empresa;

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Long getHistorico_id() {
		return historico_id;
	}

	public void setHistorico_id(Long historico_id) {
		this.historico_id = historico_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Historico_ligacao [historico_id=" + historico_id + ", descricao=" + descricao + ", data=" + data
				+ ", tipo_ligacao=" + tipo_ligacao + ", empresa=" + empresa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((historico_id == null) ? 0 : historico_id.hashCode());
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
		Historico_ligacao other = (Historico_ligacao) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (historico_id == null) {
			if (other.historico_id != null)
				return false;
		} else if (!historico_id.equals(other.historico_id))
			return false;
		return true;
	}

	public Historico_ligacao() {
		empresa = new Empresa();
		tipo_ligacao = new Tipo_ligacao();
	}

}
