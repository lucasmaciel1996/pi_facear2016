package br.edu.facear.crm.teste;



import br.edu.facear.crm.bo.UsuarioBO;
import br.edu.facear.crm.entity.Usuario;

public class UsuarioTeste {
	
	
	public static void main(String[] args) {
		testeInsert();
	}


	private static void testeInsert() {

		
	     Usuario usuario = new Usuario();
	     
		usuario.setUsuario_nome("Cesar");
		usuario.setUsuario_senha("123");
		
		
		UsuarioBO usuarioBO = new UsuarioBO();
		try {
			usuarioBO.salvar(usuario);
		} catch (Exception e) {
			System.err.println("Erro ao inserir"+e.getMessage());
		}
		System.out.println("salvo com sucesso!");
	}


}
