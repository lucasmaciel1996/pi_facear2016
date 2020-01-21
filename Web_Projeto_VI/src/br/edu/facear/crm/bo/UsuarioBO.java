package br.edu.facear.crm.bo;

import java.util.List;

import br.edu.facear.crm.dao.UsuarioDao;
import br.edu.facear.crm.entity.Usuario;

public class UsuarioBO {
	
	public void salvar(Usuario usuario){	
		UsuarioDao usuarioDAO = new UsuarioDao();
		usuarioDAO.Salvar(usuario);		
	}
	
	public List<Usuario> listar() {
		UsuarioDao usuarioDAO = new UsuarioDao();
		return usuarioDAO.listar();
	}
	
	public void editar(Usuario usuario) {
		UsuarioDao usuarioDAO = new UsuarioDao();
		usuarioDAO.editar(usuario);
	}

	public Usuario getObjectById(Long id) {		
		UsuarioDao usuarioDAO = new UsuarioDao();
		return usuarioDAO.getObjectById(id);
	}
	
	public void excluir(Long id) {		
		UsuarioDao usuarioDAO = new UsuarioDao();
		usuarioDAO.excluir(id);
	}
	
	public void novo(Usuario usuario) {
		UsuarioDao usuarioDAO = new UsuarioDao();
		usuarioDAO.novo(usuario);
	}
	
	public void voltar(Usuario usuario) {
		UsuarioDao usuarioDAO = new UsuarioDao();
		usuarioDAO.voltar(usuario);
	}
	
}



