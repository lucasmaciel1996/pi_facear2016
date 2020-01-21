package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Tipo_empresa;
import br.edu.facear.crm.entity.Tipo_telefone;

public class Tipo_telefoneDao implements InterfaceDao<Tipo_telefone>{

	@Override
	public void Salvar(Tipo_telefone tipo_telefone) {
		// TODO Auto-generated method stub
        EntityManager em = Conexao.getEntityManager();
		
           em.getTransaction().begin();
           em.persist(tipo_telefone);
           em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo_telefone> listar() {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		
		Query q = em.createQuery("select a from Tipo_telefone a ");
		
		return q.getResultList();
		
	}

	@Override
	public void editar(Tipo_telefone tipo_telefone) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(tipo_telefone);
		em.getTransaction().commit();
		
	}

	@Override
	public Tipo_telefone getObjectById(Long id) {
		// TODO Auto-generated method stub
        EntityManager em= Conexao.getEntityManager();
		
		return em.find(Tipo_telefone.class,id);
			
	}



	@Override
	public void excluir(Long id) {
		EntityManager em = Conexao.getEntityManager();
		Tipo_telefone tipo_telefone = em.find(Tipo_telefone.class, id);
		
		em.getTransaction().begin();
		em.remove(tipo_telefone);		
		em.getTransaction().commit();
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
	public void voltar(Tipo_telefone tipo_telefone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Tipo_telefone tipo_telefone) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
