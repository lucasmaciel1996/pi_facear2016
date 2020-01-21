package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.facear.crm.entity.Tipo_empresa;

public class Tipo_empresaDao implements InterfaceDao<Tipo_empresa> {

	@Override
	public void Salvar(Tipo_empresa tipo_empresa) {
		// TODO Auto-generated method stub

        EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(tipo_empresa);
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo_empresa> listar() {
		// TODO Auto-generated method stub
		
		EntityManager em = Conexao.getEntityManager();

		Query q = em.createQuery("select a from Tipo_empresa a ");
		
		return q.getResultList();
		
	}

	@Override
	public void editar(Tipo_empresa tipo_empresa) {
		// TODO Auto-generated method stub
		
		 EntityManager em = Conexao.getEntityManager();
			
		    em.getTransaction().begin();
			em.merge(tipo_empresa);//faz o editar/	
			em.getTransaction().commit();
			
		
	}

	@Override
	public Tipo_empresa getObjectById(Long id) {
		// TODO Auto-generated method stub
		
			EntityManager em = Conexao.getEntityManager();
		
		return em.find(Tipo_empresa.class,id);
		
		

	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
		
		EntityManager em = Conexao.getEntityManager();
		try {
			em.getTransaction().begin();
			Tipo_empresa obj = em.find(Tipo_empresa.class,id);
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
		Tipo_empresa tipo_empresa = em.find(Tipo_empresa.class, id);
		
		em.getTransaction().begin();
		em.remove(tipo_empresa);		
		em.getTransaction().commit();
	}
		
	@Override
	public void voltar(Tipo_empresa tipo_empresa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Tipo_empresa tipo_empresa) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
