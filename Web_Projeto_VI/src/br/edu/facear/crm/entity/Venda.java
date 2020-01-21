package br.edu.facear.crm.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_VENDA")
public class Venda {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long venda_id;
	
	private Date data_venda;
	
	private int quantidade;
	
	@ManyToOne
	private Empresa empresa;

	@ManyToOne
	private Usuario usuario;

	@ManyToOne
	private Produto produto;

	

	public Long getVenda_id() {
		return venda_id;
	}



	public void setVenda_id(Long venda_id) {
		this.venda_id = venda_id;
	}



	public Date getData_venda() {
		return data_venda;
	}



	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Empresa getEmpresa() {
		return empresa;
	}



	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	@Override
	public String toString() {
		return "Venda [venda_id=" + venda_id + ", data_venda=" + data_venda + ", quantidade=" + quantidade
				+  ", empresa=" + empresa + ", usuario=" + usuario + ", produto="
				+ produto + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_venda == null) ? 0 : data_venda.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + quantidade;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((venda_id == null) ? 0 : venda_id.hashCode());
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
		Venda other = (Venda) obj;
		if (data_venda == null) {
			if (other.data_venda != null)
				return false;
		} else if (!data_venda.equals(other.data_venda))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (venda_id == null) {
			if (other.venda_id != null)
				return false;
		} else if (!venda_id.equals(other.venda_id))
			return false;
		return true;
	}



	public Venda(Long venda_id, Date data_venda, int quantidade, double valor_produto, Empresa empresa, Usuario usuario,
			Produto produto) {
		super();
		this.venda_id = venda_id;
		this.data_venda = data_venda;
		this.quantidade = quantidade;
		this.empresa = empresa;
		this.usuario = usuario;
		this.produto = produto;
	}



	public Venda() {
		super();
		// TODO Auto-generated constructor stub
		empresa = new Empresa();
		usuario = new Usuario();
		produto = new Produto();
	}

	
	
}
