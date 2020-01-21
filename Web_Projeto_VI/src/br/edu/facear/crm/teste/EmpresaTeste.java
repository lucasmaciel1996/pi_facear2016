package br.edu.facear.crm.teste;


import java.util.List;

import br.edu.facear.crm.bo.EmpresaBO;
import br.edu.facear.crm.dao.EmpresaDao;
import br.edu.facear.crm.dao.Tipo_contatoDao;
import br.edu.facear.crm.dao.Tipo_empresaDao;
import br.edu.facear.crm.dao.Tipo_telefoneDao;
import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Tipo_contato;
import br.edu.facear.crm.entity.Tipo_empresa;
import br.edu.facear.crm.entity.Tipo_telefone;

public class EmpresaTeste {
	
	
	public static void main(String[] args) {
		testeInsert();
	}

	private static void testeInsert() {
		
		Tipo_empresaDao tipodao = new Tipo_empresaDao();
		Tipo_empresa tipo = new Tipo_empresa();
		tipo.setDescricao("informatica");
		tipodao.Salvar(tipo);
		
		Tipo_contatoDao tipocontatodao = new Tipo_contatoDao();
		Tipo_contato tipo_c = new Tipo_contato();
		tipo_c.setDescricao("Cliente");
		tipocontatodao.Salvar(tipo_c);
		
		Tipo_telefoneDao tipo_telefonedao = new Tipo_telefoneDao();
		Tipo_telefone tipo_telefone = new Tipo_telefone();
		tipo_telefone.setDescricao("Fax");
		tipo_telefonedao.Salvar(tipo_telefone);
		
		
		Tipo_telefone tipo_telefone2 = new Tipo_telefone();
		tipo_telefone2.setDescricao("Celular");
		tipo_telefonedao.Salvar(tipo_telefone2);
		List<Tipo_telefone> tipo_fone = tipo_telefonedao.listar();
		
		EmpresaDao empresadao = new EmpresaDao();
		Empresa empresa = new Empresa();
		empresa.setEmpresa_nome("M&C Informatica");
		empresa.setEndereco("Rua Sabará");
		empresa.setFax("413333-3333");
		empresa.setInscricao_estadual("111.111.1111.");
		empresa.setSite("www.facear.com.br");
		empresa.setTelefone("41 3333-3333");
		empresa.setNome_contato("João");
		empresa.setTipo_empresa(tipo);
		empresa.setTipo_contato(tipo_c);
		empresa.setTipo_telefone (tipo_fone);
		empresadao.Salvar(empresa);
		
		
		
		
		EmpresaBO empresaBO = new EmpresaBO();
		try {
			empresaBO.salvar(empresa);
		} catch (Exception e) {
			System.err.println("Erro ao inserir"+e.getMessage());
		}
		System.out.println("salvo com sucesso!");
	}
	}

		
		
		
		
		
		
	


