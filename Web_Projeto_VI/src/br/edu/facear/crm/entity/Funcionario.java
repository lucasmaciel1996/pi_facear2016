package br.edu.facear.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "TAB_FUNCIONARIO")

public class Funcionario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long funcionario_id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "CPF")
	private String cpf;
	@Column(name = "MATRICULA")
	private int matricula;
	@Column(name = "DATA_ADMISSAO")
	private String data_admissao;
	@Column(name = "FUNCAO")
	private String funcao;
	
	
	@ManyToOne
	private Venda venda;


	public Long getFuncionario_id() {
		return funcionario_id;
	}


	public void setFuncionario_id(Long funcionario_id) {
		this.funcionario_id = funcionario_id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getData_admissao() {
		return data_admissao;
	}


	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public Venda getVenda() {
		return venda;
	}


	public void setVenda(Venda venda) {
		this.venda = venda;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((data_admissao == null) ? 0 : data_admissao.hashCode());
		result = prime * result + ((funcao == null) ? 0 : funcao.hashCode());
		result = prime * result
				+ ((funcionario_id == null) ? 0 : funcionario_id.hashCode());
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((venda == null) ? 0 : venda.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (data_admissao == null) {
			if (other.data_admissao != null)
				return false;
		} else if (!data_admissao.equals(other.data_admissao))
			return false;
		if (funcao == null) {
			if (other.funcao != null)
				return false;
		} else if (!funcao.equals(other.funcao))
			return false;
		if (funcionario_id == null) {
			if (other.funcionario_id != null)
				return false;
		} else if (!funcionario_id.equals(other.funcionario_id))
			return false;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (venda == null) {
			if (other.venda != null)
				return false;
		} else if (!venda.equals(other.venda))
			return false;
		return true;
	}


	public Funcionario(Long funcionario_id, String nome, String cpf,
			int matricula, String data_admissao, String funcao, Venda venda) {
		super();
		this.funcionario_id = funcionario_id;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.data_admissao = data_admissao;
		this.funcao = funcao;
		this.venda = venda;
	}


	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
