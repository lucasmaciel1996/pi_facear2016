package br.edu.facear.crm.teste;

import br.edu.facear.crm.entity.Empresa;
import br.edu.facear.crm.entity.Tipo_comunicador;
import br.edu.facear.crm.entity.Tipo_contato;
import br.edu.facear.crm.entity.Tipo_empresa;
import br.edu.facear.crm.facade.Facade;

public class EmpresaDelete {
	public static void main(String[] args) {
		
		cadastrarEmpresa();
	
		
		
	}

	private static void cadastrarEmpresa() {
		Empresa empresa = new Empresa();

	/*	empresa.setCnpj("655.350.0001/59");
	empresa.setEmpresa_nome("Facear");
		empresa.setEndereco("Av das Araucarias");
		empresa.setFax("3642-2020");
		empresa.setInscricao_estadual("345912054");
		empresa.setNome_contato("Cesar");
		empresa.setSite("www.facear.com.br");
		empresa.setTelefone("3642-1515");
*/
		Tipo_comunicador tipo_comunicador = new Tipo_comunicador();
		tipo_comunicador.setTipo_comunicador_id(1L);
		empresa.setTipo_comunicador(tipo_comunicador);

		Tipo_contato tipo_contato = new Tipo_contato();
		tipo_contato.setTipo_contato_id(1L);
		empresa.setTipo_contato(tipo_contato);

		Tipo_empresa tipo_empresa = new Tipo_empresa();
		tipo_empresa.setTipo_empresa_id(1L);
		empresa.setTipo_empresa(tipo_empresa);

		Facade facade = new Facade();
		facade.salvarEmpresa(empresa);

		
	}
	
		
	

}
