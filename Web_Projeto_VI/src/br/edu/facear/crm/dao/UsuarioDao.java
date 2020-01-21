package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Usuario;

public class UsuarioDao implements InterfaceDao<Usuario>{

	public void Salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		
        EntityManager us = Conexao.getEntityManager();
		
		us.getTransaction().begin();
		us.persist(usuario);
		us.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		
        EntityManager us = Conexao.getEntityManager();
		
		Query q = us.createQuery("select a from Usuario a ");
		
		return q.getResultList();
	}

	@Override
	public void editar(Usuario usuario) {
		// TODO Auto-generated method stub
		
		
        EntityManager us = Conexao.getEntityManager();
		
		us.getTransaction().begin();
		us.merge(usuario);//faz o editar//
		
		us.getTransaction().commit();
	}

	@Override
	public Usuario getObjectById(Long id) {
		// TODO Auto-generated method stub
		
     EntityManager us = Conexao.getEntityManager();
		
		return us.find(Usuario.class,id);
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		EntityManager usu = Conexao.getEntityManager();
		try {
			usu.getTransaction().begin();
			UsuarioDao obj = usu.find(UsuarioDao.class,id);
			usu.remove(obj);
			usu.getTransaction().commit();
		} finally {
			usu.close();
		}
		
		
	}


	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Usuario usuario = em.find(Usuario.class, id);
		
		em.getTransaction().begin();
		em.remove(usuario);		
		em.getTransaction().commit();
		
	}

	@Override
	public void voltar(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	
	}
	


