package br.edu.facear.crm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_EMPRESA")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empresa_id;
	@Column
	private String empresa_nome;
	private String cnpj;
	private String inscricao_estadual;
	private String endereco;
	private String telefone;
	private String fax;
	private String site;
	private String nome_contato;

	@ManyToMany
	@JoinTable(name = "TB_TELEFONES_EMPRESA", joinColumns = @JoinColumn(name = "empresa_id"), inverseJoinColumns = @JoinColumn(name = "tipo_telefone_id"))

	private List<Tipo_telefone> tipo_telefones;

	
	@ManyToOne
	private Tipo_comunicador tipo_comunicador;

	@ManyToOne
	private Tipo_empresa tipo_empresa;

	@ManyToOne
	private  Tipo_contato tipo_contato;

	@OneToMany
	private List<Usuario> usuarios;

	public Long getEmpresa_id() {
		return empresa_id;
	}

	public List<Tipo_telefone> getTipo_telefones() {
		return tipo_telefones;
	}

	public void setTipo_telefones(List<Tipo_telefone> tipo_telefones) {
		this.tipo_telefones = tipo_telefones;
	}

	public void setEmpresa_id(Long empresa_id) {
		this.empresa_id = empresa_id;
	}

	public String getEmpresa_nome() {
		return empresa_nome;
	}

	public void setEmpresa_nome(String empresa_nome) {
		this.empresa_nome = empresa_nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricao_estadual() {
		return inscricao_estadual;
	}

	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public List<Tipo_telefone> getTipo_telefone() {
		return tipo_telefones;
	}

	public void setTipo_telefone(List<Tipo_telefone> tipo_telefone) {
		this.tipo_telefones = tipo_telefone;
	}

	public Tipo_comunicador getTipo_comunicador() {
		return tipo_comunicador;
	}

	public void setTipo_comunicador(Tipo_comunicador tipo_comunicador) {
		this.tipo_comunicador = tipo_comunicador;
	}

	public Tipo_empresa getTipo_empresa() {
		return tipo_empresa;
	}

	public void setTipo_empresa(Tipo_empresa tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}

	public Tipo_contato getTipo_contato() {
		return tipo_contato;
	}

	public void setTipo_contato(Tipo_contato tipo_contato) {
		this.tipo_contato = tipo_contato;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return empresa_nome;
	/*	return "Empresa [empresa_id=" + empresa_id + ", empresa_nome=" + empresa_nome + ", cnpj=" + cnpj
				+ ", inscricao_estadual=" + inscricao_estadual + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", fax=" + fax + ", site=" + site + ", nome_contato=" + nome_contato + ", tipo_telefones="
				+ tipo_telefones + ", tipo_comunicador=" + tipo_comunicador + ", tipo_empresa=" + tipo_empresa
				+ ", tipo_contato=" + tipo_contato + ", usuarios=" + usuarios + "]";  */
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((empresa_id == null) ? 0 : empresa_id.hashCode());
		result = prime * result + ((empresa_nome == null) ? 0 : empresa_nome.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((inscricao_estadual == null) ? 0 : inscricao_estadual.hashCode());
		result = prime * result + ((nome_contato == null) ? 0 : nome_contato.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((tipo_comunicador == null) ? 0 : tipo_comunicador.hashCode());
		result = prime * result + ((tipo_contato == null) ? 0 : tipo_contato.hashCode());
		result = prime * result + ((tipo_empresa == null) ? 0 : tipo_empresa.hashCode());
		result = prime * result + ((tipo_telefones == null) ? 0 : tipo_telefones.hashCode());
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;

		if (empresa_id == null) {
			if (other.empresa_id != null)
				return false;
		} else if (!empresa_id.equals(other.empresa_id))
			return false;
		if (empresa_nome == null) {
			if (other.empresa_nome != null)
				return false;
		} else if (!empresa_nome.equals(other.empresa_nome))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (inscricao_estadual == null) {
			if (other.inscricao_estadual != null)
				return false;
		} else if (!inscricao_estadual.equals(other.inscricao_estadual))
			return false;
		if (nome_contato == null) {
			if (other.nome_contato != null)
				return false;
		} else if (!nome_contato.equals(other.nome_contato))
			return false;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (tipo_comunicador == null) {
			if (other.tipo_comunicador != null)
				return false;
		} else if (!tipo_comunicador.equals(other.tipo_comunicador))
			return false;
		if (tipo_contato == null) {
			if (other.tipo_contato != null)
				return false;
		} else if (!tipo_contato.equals(other.tipo_contato))
			return false;
		if (tipo_empresa == null) {
			if (other.tipo_empresa != null)
				return false;
		} else if (!tipo_empresa.equals(other.tipo_empresa))
			return false;
		if (tipo_telefones == null) {
			if (other.tipo_telefones != null)
				return false;
		} else if (!tipo_telefones.equals(other.tipo_telefones))
			return false;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}



	public Empresa() {
		super();
		// TODO Auto-generated constructor stub

		tipo_comunicador = new Tipo_comunicador();
		tipo_empresa = new Tipo_empresa();
		tipo_contato = new Tipo_contato();
	   
	}

}
