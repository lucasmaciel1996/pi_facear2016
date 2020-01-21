package br.edu.facear.crm.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_TAREFA")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tarefa_id;
	private String descricao;
	private Date data_inicio;
	private String solucao;
	private Date data_final;

	@ManyToOne
	private Empresa empresa;

	@ManyToOne
	private Origem_contato origem_contato;

	@ManyToOne
	private Prioridade prioridade;

	@ManyToOne
	private Usuario usuario;

	@ManyToOne
	private Situacao situacao;

	public Date getData_final() {
		return data_final;
	}

	public void setData_final(Date data_final) {
		this.data_final = data_final;
	}

	public Long getTarefa_id() {
		return tarefa_id;
	}

	public void setTarefa_id(Long tarefa_id) {
		this.tarefa_id = tarefa_id;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Origem_contato getOrigem_contato() {
		return origem_contato;
	}

	public void setOrigem_contato(Origem_contato origem_contato) {
		this.origem_contato = origem_contato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return descricao;
		/*return "Tarefa [tarefa_id=" + tarefa_id + ", descricao=" + descricao + ", data_inicio=" + data_inicio
				+ ", solucao=" + solucao + ", data_final=" + data_final + ", empresa=" + empresa + ", origem_contato="
				+ origem_contato + ", prioridade=" + prioridade + ", usuario=" + usuario + ", situacao=" + situacao
				+ "]";  */
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_final == null) ? 0 : data_final.hashCode());
		result = prime * result + ((data_inicio == null) ? 0 : data_inicio.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((origem_contato == null) ? 0 : origem_contato.hashCode());
		result = prime * result + ((prioridade == null) ? 0 : prioridade.hashCode());
		result = prime * result + ((situacao == null) ? 0 : situacao.hashCode());
		result = prime * result + ((solucao == null) ? 0 : solucao.hashCode());
		result = prime * result + ((tarefa_id == null) ? 0 : tarefa_id.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Tarefa other = (Tarefa) obj;
		if (data_final == null) {
			if (other.data_final != null)
				return false;
		} else if (!data_final.equals(other.data_final))
			return false;
		if (data_inicio == null) {
			if (other.data_inicio != null)
				return false;
		} else if (!data_inicio.equals(other.data_inicio))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (origem_contato == null) {
			if (other.origem_contato != null)
				return false;
		} else if (!origem_contato.equals(other.origem_contato))
			return false;
		if (prioridade == null) {
			if (other.prioridade != null)
				return false;
		} else if (!prioridade.equals(other.prioridade))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		if (solucao == null) {
			if (other.solucao != null)
				return false;
		} else if (!solucao.equals(other.solucao))
			return false;
		if (tarefa_id == null) {
			if (other.tarefa_id != null)
				return false;
		} else if (!tarefa_id.equals(other.tarefa_id))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public Tarefa(Long tarefa_id, Date data_inicio, String descricao, String solucao, Empresa empresa,
			Origem_contato origem_contato, Usuario usuario, Prioridade prioridade, Situacao situacao) {
		super();
		this.tarefa_id = tarefa_id;
		this.data_inicio = data_inicio;
		this.descricao = descricao;
		this.solucao = solucao;
		this.empresa = empresa;
		this.origem_contato = origem_contato;
		this.usuario = usuario;
		this.prioridade = prioridade;
		this.situacao = situacao;
	}

	public Tarefa(Long tarefa_id, Empresa empresa, Origem_contato origem_contato, String descricao, Date data_inicio,
			Prioridade prioridade, Usuario usuario, Situacao situacao, String solucao, Date data_final) {
		super();
		this.tarefa_id = tarefa_id;
		this.empresa = empresa;
		this.origem_contato = origem_contato;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.prioridade = prioridade;
		this.usuario = usuario;
		this.situacao = situacao;
		this.solucao = solucao;
		this.data_final = data_final;
	}

	public Tarefa() {
		super();
		// TODO Auto-generated constructor stub
		empresa = new Empresa();
		origem_contato = new Origem_contato();
		usuario = new Usuario();
		prioridade = new Prioridade();
		situacao = new Situacao();
	}

}
