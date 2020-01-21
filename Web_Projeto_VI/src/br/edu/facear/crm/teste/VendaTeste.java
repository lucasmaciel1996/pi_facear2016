package br.edu.facear.crm.teste;

import java.text.DateFormat;
import java.util.Date;

import br.edu.facear.crm.bo.VendaBO;
import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Usuario;
import br.edu.facear.crm.entity.Venda;



public class VendaTeste {
	
	public static void main(String[] args) {
		testeInsert();
	}

	private static void testeInsert() {
		Venda venda = new Venda();
		@SuppressWarnings("unused")
		DateFormat data_venda = DateFormat.getDateInstance();
		Date data = new Date();
		
		venda.setData_venda(data);
		Empresa empresa = new Empresa();
		empresa.setEmpresa_id(1L);
		venda.setEmpresa(empresa);
		Usuario usuario = new Usuario();
		usuario.setUsuario_id(1L);
		venda.setUsuario(usuario);
	
		
		
		
		VendaBO vendaBO = new VendaBO();
		try {
			vendaBO.salvar(venda);
		} catch (Exception e) {
			System.err.println("Erro ao inserir"+e.getMessage());
		}
		System.out.println("salvo com sucesso!");
	}

	
	

}
