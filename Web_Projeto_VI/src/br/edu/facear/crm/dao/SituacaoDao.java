package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.facear.crm.entity.Situacao;



public class SituacaoDao implements  InterfaceDao <Situacao>{

	@Override
	public void Salvar(Situacao situacao) {
		// TODO Auto-generated method stub
		
         EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(situacao);
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Situacao> listar() {
		// TODO Auto-generated method stub
		
		EntityManager em = Conexao.getEntityManager();
		Query q = em.createQuery("select a from Situacao a ");
		
		return q.getResultList();
	}

	@Override
	public void editar(Situacao situacao) {
		// TODO Auto-generated method stub
		
		 EntityManager em = Conexao.getEntityManager();
			
			em.getTransaction().begin();
			em.merge(situacao);//faz o editar//
			em.getTransaction().commit();	
	}

	@Override
	public Situacao getObjectById(Long id) {
		// TODO Auto-generated method stub
         EntityManager em = Conexao.getEntityManager();
		
		return em.find(Situacao.class,id);
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
		
		EntityManager sit = Conexao.getEntityManager();
		try {
			sit.getTransaction().begin();
			Situacao obj = sit.find(Situacao.class,id);
			sit.remove(obj);
			sit.getTransaction().commit();
		} finally {
			sit.close();
		}
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Situacao situacao = em.find(Situacao.class, id);
		
		em.getTransaction().begin();
		em.remove(situacao);		
		em.getTransaction().commit();
		
	}

	@Override
	public void voltar(Situacao situacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Situacao situacao) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
