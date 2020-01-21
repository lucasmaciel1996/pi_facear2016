package br.edu.facear.crm.teste;

import br.edu.facear.crm.entity.Tipo_telefone;
import br.edu.facear.crm.facade.Facade;

public class Tipo_TelefoneTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cadastrar();
		

	}

	private static void Cadastrar() {
		// TODO Auto-generated method stub
		
		Tipo_telefone tipo_telefone = new Tipo_telefone();
		
		tipo_telefone.setDescricao("Comercial");
		
		Facade facade = new Facade();
		facade.salvarTipo_telefone(tipo_telefone);
		
	}

}
