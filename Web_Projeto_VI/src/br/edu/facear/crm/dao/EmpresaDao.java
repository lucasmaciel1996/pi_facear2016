package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.facear.crm.entity.Empresa;


public class EmpresaDao implements InterfaceDao<Empresa>{

	public void Salvar(Empresa empresa) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(empresa);
		em.getTransaction().commit();
		return;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> listar() {
        EntityManager em = Conexao.getEntityManager();
		Query q = em.createQuery("select a from Empresa a");
		
		return q.getResultList();
	}
	@Override
	public void editar(Empresa empresa) {
		// TODO Auto-generated method stub
		
      EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(empresa);//faz o editar//
		
		em.getTransaction().commit();
	}

	@Override
	public Empresa getObjectById(Long id) {
		// TODO Auto-generated method stub
		
EntityManager em = Conexao.getEntityManager();
		
		return em.find(Empresa.class,id);
		
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		try {
			em.getTransaction().begin();
			Empresa obj = em.find(Empresa.class,id);
			em.remove(obj);
			em.getTransaction().commit();
		} finally {
			em.close();
	    }
	    }


	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Empresa empresa = em.find(Empresa.class, id);
		
		em.getTransaction().begin();
		em.remove(empresa);		
		em.getTransaction().commit();
	}

	@Override
	public void voltar(Empresa empresa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Empresa empresa) {
		// TODO Auto-generated method stub
		
	}

	
	}



	

