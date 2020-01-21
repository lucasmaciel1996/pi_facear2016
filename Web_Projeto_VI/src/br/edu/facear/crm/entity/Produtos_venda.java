package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_PRODUTOS_VENDA")
public class Produtos_venda  {
	
	//Atributos
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long produtos_venda_id;
    private int quantidade;
    private String descricao_produto;
    private double valor_produto;
    
    @ManyToOne
	private Empresa empresa;
	
	@ManyToOne
	private Usuario usuario;

    @ManyToOne
	private Produto produto;
    
    @ManyToOne
	private Venda venda;
    
	
	public Long getProdutos_venda_id() {
		return produtos_venda_id;
	}


	public void setProdutos_venda_id(Long produtos_venda_id) {
		this.produtos_venda_id = produtos_venda_id;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getDescricao_produto() {
		return descricao_produto;
	}


	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}


	public double getValor_produto() {
		return valor_produto;
	}


	public void setValor_produto(double valor_produto) {
		this.valor_produto = valor_produto;
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


	public Venda getVenda() {
		return venda;
	}


	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	

	@Override
	public String toString() {
		return "Produtos_venda [produtos_venda_id=" + produtos_venda_id + ", quantidade=" + quantidade
				+ ", descricao_produto=" + descricao_produto + ", valor_produto=" + valor_produto + ", empresa="
				+ empresa + ", usuario=" + usuario + ", produto=" + produto + ", venda=" + venda + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao_produto == null) ? 0 : descricao_produto.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((produtos_venda_id == null) ? 0 : produtos_venda_id.hashCode());
		result = prime * result + quantidade;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor_produto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Produtos_venda other = (Produtos_venda) obj;
		if (descricao_produto == null) {
			if (other.descricao_produto != null)
				return false;
		} else if (!descricao_produto.equals(other.descricao_produto))
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
		if (produtos_venda_id == null) {
			if (other.produtos_venda_id != null)
				return false;
		} else if (!produtos_venda_id.equals(other.produtos_venda_id))
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (Double.doubleToLongBits(valor_produto) != Double.doubleToLongBits(other.valor_produto))
			return false;
		if (venda == null) {
			if (other.venda != null)
				return false;
		} else if (!venda.equals(other.venda))
			return false;
		return true;
	}


	public Produtos_venda(Long produtos_venda_id, int quantidade, String descricao_produto, double valor_produto,
			Empresa empresa, Usuario usuario, Produto produto, Venda venda) {
		super();
		this.produtos_venda_id = produtos_venda_id;
		this.quantidade = quantidade;
		this.descricao_produto = descricao_produto;
		this.valor_produto = valor_produto;
		this.empresa = empresa;
		this.usuario = usuario;
		this.produto = produto;
		this.venda = venda;
	}


	public Produtos_venda() {
		super();
		// TODO Auto-generated constructor stub
		empresa = new Empresa();
		usuario = new Usuario();
		produto = new Produto();
		venda = new Venda();
	}
    
    
   
	}
  
