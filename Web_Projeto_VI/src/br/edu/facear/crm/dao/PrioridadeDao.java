package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Prioridade;

public class PrioridadeDao implements InterfaceDao <Prioridade>{

	@Override
	public void Salvar(Prioridade prioridade) {
		// TODO Auto-generated method stub
		 EntityManager em = Conexao.getEntityManager();
			
			em.getTransaction().begin();
			em.persist(prioridade);
			em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Prioridade> listar() {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Query q = em.createQuery("select a from Prioridade a ");
		
		return q.getResultList();
		
	}

	@Override
	public void editar(Prioridade prioridade) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(prioridade);//faz o editar//
		em.getTransaction().commit();	
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Prioridade prioridade = em.find(Prioridade.class, id);
		
		em.getTransaction().begin();
		em.remove(prioridade);		
		em.getTransaction().commit();
		
	}

	@Override
	public Prioridade getObjectById(Long id) {
		// TODO Auto-generated method stub
		 EntityManager em = Conexao.getEntityManager();
			
			return em.find(Prioridade.class,id);
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltar(Prioridade prioridade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Prioridade prioridade) {
		// TODO Auto-generated method stub
		
	}

}
