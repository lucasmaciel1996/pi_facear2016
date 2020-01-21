package br.edu.facear.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
	@Table(name = "TAB_CONTATO")
	public class Contato {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		
		private Long id_contato;
		private String nome_contato;
		
		@ManyToOne
		private Empresa empresa;

		
		public Long getId_contato() {
			return id_contato;
		}


		public void setId_contato(Long id_contato) {
			this.id_contato = id_contato;
		}


		public String getNome_contato() {
			return nome_contato;
		}


		public void setNome_contato(String nome_contato) {
			this.nome_contato = nome_contato;
		}


		public Empresa getEmpresa() {
			return empresa;
		}


		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}


		@Override
		public String toString() {
			return "Contato [id_contato=" + id_contato + ", nome_contato=" + nome_contato + ", empresa=" + empresa
					+ "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
			result = prime * result + ((id_contato == null) ? 0 : id_contato.hashCode());
			result = prime * result + ((nome_contato == null) ? 0 : nome_contato.hashCode());
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
			Contato other = (Contato) obj;
			if (empresa == null) {
				if (other.empresa != null)
					return false;
			} else if (!empresa.equals(other.empresa))
				return false;
			if (id_contato == null) {
				if (other.id_contato != null)
					return false;
			} else if (!id_contato.equals(other.id_contato))
				return false;
			if (nome_contato == null) {
				if (other.nome_contato != null)
					return false;
			} else if (!nome_contato.equals(other.nome_contato))
				return false;
			return true;
		}


		public Contato(Long id_contato, String nome_contato, Empresa empresa) {
			super();
			this.id_contato = id_contato;
			this.nome_contato = nome_contato;
			this.empresa = empresa;
		}


		public Contato() {
			super();
			
			empresa = new Empresa();
			
		}
		
		
		
		
		

}
