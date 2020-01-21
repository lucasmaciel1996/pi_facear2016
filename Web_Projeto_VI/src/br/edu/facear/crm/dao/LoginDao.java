package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.facear.crm.entity.Login;


public class LoginDao implements InterfaceDao <Login>{

	@Override
	public void Salvar(Login login) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		
	    em.getTransaction().begin();
	    em.persist(login);
	    em.getTransaction().commit();
	}
	

	@Override
	public List<Login> listar() {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();
		
		  Query q = em.createQuery("select a from Login a ");
		
		  return q.getResultList();

	}

	@Override
	public void editar(Login login) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(login);
		em.getTransaction().commit();
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Login login = em.find(Login.class, id);
		
		em.getTransaction().begin();
		em.remove(login);		
		em.getTransaction().commit();
	}

	@Override
	public Login getObjectById(Long id) {
		// TODO Auto-generated method stub
		 EntityManager em= Conexao.getEntityManager();
			
			return em.find(Login.class,id);
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltar(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Login login) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Login> ValidarLogin(Login login) {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();
		
		  Query q = em.createQuery("select a from Login a where a.login=:arg1 and a.senha=:arg2");
		  q.setParameter("arg1", login.getLogin());
		  q.setParameter("arg2", login.getSenha());
		
		  return q.getResultList();

	}


}
